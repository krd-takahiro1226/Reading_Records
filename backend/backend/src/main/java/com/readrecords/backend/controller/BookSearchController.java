package com.readrecords.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.readrecords.backend.repository.BookRecordsRepository;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/searchBooks")
public class BookSearchController {
  @Autowired
  BookRecordsRepository bookRecordsRepository;
  @RequestMapping("/and/and/partial/partial")
  @GetMapping
  public String searchBooks1_1(String book_name, String author, Model model){
    // Iterable<BookRecords> thisBook = bookRecordsRepository.findByPartialBooknameAndPartialAuthor(book_name, author);
    // model.addAttribute("thisBook", thisBook);
    return "search";
  }
  @RequestMapping("/and/or/partial/partial")
  public String searchBooks1_2(){
    return "search";
  }
  @RequestMapping("/or/and/partial/partial")
  public String searchBooks1_3(){
    return "search";
  }
  @RequestMapping("/or/or/partial/partial")
  public String searchBooks1_4(){
    return "search";
  }
  @RequestMapping("/and/and/partial/perfect")
  public String searchBooks2_1(){
    return "search";
  }
  @RequestMapping("/and/or/partial/perfect")
  public String searchBooks2_2(){
    return "search";
  }
  @RequestMapping("/or/and/partial/perfect")
  public String searchBooks2_3(){
    return "search";
  }
  @RequestMapping("/or/or/partial/perfect")
  public String searchBooks2_4(){
    return "search";
  }
  @RequestMapping("/and/and/perfect/partial")
  public String searchBooks3_1(){
    return "search";
  }
  @RequestMapping("/and/or/perfect/partial")
  public String searchBooks3_2(){
    return "search";
  }
  @RequestMapping("/or/and/perfect/partial")
  public String searchBooks3_3(){
    return "search";
  }
  @RequestMapping("/or/or/perfect/partial")
  public String searchBooks3_4(){
    return "search";
  }
  @RequestMapping("/and/and/perfect/perfect")
  public String searchBooks4_1(){
    return "search";
  }
  @RequestMapping("/and/or/perfect/perfect")
  public String searchBooks4_2(){
    return "search";
  }
  @RequestMapping("/or/and/perfect/perfect")
  public String searchBooks4_3(){
    return "search";
  }
  @RequestMapping("/or/or/perfect/perfect")
  public String searchBooks4_4(){
    return "search";
  }
}
