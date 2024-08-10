package com.readrecords.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.readrecords.backend.client.BookSearchApiClient;
import com.readrecords.backend.entity.SearchBooksResponse;

@Controller
@RequestMapping(value = "/searchBooks/sruSearch",method = RequestMethod.POST)
public class BookSearchApiController {
  @Autowired BookSearchApiClient bookSearchApiClient;
  @GetMapping
  public String showSearchWindow(@RequestParam String title, @RequestParam String author, @RequestParam String publisherName,@RequestParam String isbn, Model model) throws Exception{
    SearchBooksResponse response = bookSearchApiClient.getBookSearch(title, author, publisherName,isbn);
    model.addAttribute("response", response);
    return "searchResults";
}
}
