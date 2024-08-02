package com.readrecords.backend.client;

import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.readrecords.backend.entity.SearchRetrieveResponse;
import com.readrecords.backend.service.XmlParser;

@Service
public class BookSearchApiClientImpl implements BookSearchApiClient {
  @Autowired XmlParser xmlParser;
  @Override
  public SearchRetrieveResponse getBookSearch(String title, String creator, String isbn) throws Exception {
    String requestPath = "https://ndlsearch.ndl.go.jp/api/sru?operation=searchRetrieve";
    URL requestURL = null;
    try {
    String titlequery = "title=\"" + title + "\"";
    String creatorquery = "creator=\"" + creator + "\"";
    String isbnquery = "isbn=\"" + isbn + "\"";
    String query;
    if (title != null && creator != null && isbn != null) {
        query = titlequery + " AND " + creatorquery + " AND " + isbnquery;
    } else if (title != null && creator != null) {
        query = titlequery + " AND " + creatorquery;
    } else if (title != null && isbn != null) {
        query = titlequery + " AND " + isbnquery;
    } else if (creator != null && isbn != null) {
        query = creatorquery + " AND " + isbnquery;
    } else if (title != null) {
        query = titlequery;
    } else if (creator != null) {
        query = creatorquery;
    } else if (isbn != null) {
        query = isbnquery;
    } else {
        throw new Exception("検索条件を入力してください");
    }
    // UTF-8エンコード処理
    String queryEncoding = URLEncoder.encode(query, "UTF-8").replace("+","%20");
    Map<String, String> queryMap = new HashMap<String, String>();
    queryMap.put("maximumRecords", "10");
    queryMap.put("query", queryEncoding);
    StringJoiner url = new StringJoiner("&");
    url.add(requestPath);
    queryMap.forEach((key, value) -> url.add(key + "=" + value));
    requestURL = URI.create(url.toString()).toURL();
      // エラーハンドリング
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
    // コネクションのインスタンス
    HttpURLConnection conn = (HttpURLConnection) requestURL.openConnection();
    // リクエストメソッドとしてGETメソッドを指定
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Accept", "application/xml");
    // 正常終了以外エラーとする
    if (conn.getResponseCode() != 200){
    throw new RuntimeException("Failed : HTTP error code : "
        + conn.getResponseCode());
    }
    // InputStreamReaderを使用するとUTF-16で取得してしまうため、もしかしたら修正する必要あり
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader((conn.getInputStream())));
    // StringBuilder=文字列連結が効率よく行えるStringのイメージ
    StringBuilder response = new StringBuilder();
    String output;
    // BufferedReaderの内容を1行ずつ読み込んでStringBuilderに追加
    while ((output = br.readLine()) != null) {
    response.append(output);
    }
    conn.disconnect();
    return xmlParser.parse(response.toString());
}
}
