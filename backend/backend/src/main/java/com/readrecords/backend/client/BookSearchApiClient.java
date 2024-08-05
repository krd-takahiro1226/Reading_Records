package com.readrecords.backend.client;

import org.springframework.stereotype.Service;

import com.readrecords.backend.entity.SearchBooksResponse;

@Service
public interface BookSearchApiClient {
public SearchBooksResponse getBookSearch(String title, String creator, String publisherName, String isbn) throws Exception;
}
