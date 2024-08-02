package com.readrecords.backend.client;

import org.springframework.stereotype.Service;

import com.readrecords.backend.entity.SearchRetrieveResponse;

@Service
public interface BookSearchApiClient {
public SearchRetrieveResponse getBookSearch(String title, String creator, String isbn) throws Exception;
}
