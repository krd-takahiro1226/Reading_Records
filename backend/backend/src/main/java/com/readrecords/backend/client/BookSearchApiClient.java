package com.readrecords.backend.client;

import org.springframework.stereotype.Service;

@Service
public interface BookSearchApiClient {
public String getBookSearch(String title, String creator, String isbn) throws Exception;
}
