package com.readrecords.backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.readrecords.backend.entity.ReadRecords;
import com.readrecords.backend.service.BackendService;


@Controller
@RequestMapping("/api/v1/readrecords")
public class BackendController {
  @Autowired
  BackendService service;
  public Optional<ReadRecords> findByBookname(String book_name) {
    return service.findByBookname(book_name);
  }


}
