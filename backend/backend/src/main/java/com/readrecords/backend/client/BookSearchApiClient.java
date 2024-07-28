package com.readrecords.backend.client;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class BookSearchApiClient {
  public String getBookSearch(String keyword) throws Exception {
    URL url = URI.create(keyword).toURL();
    // コネクションのインスタンス
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
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
    return response.toString();
  }
}
