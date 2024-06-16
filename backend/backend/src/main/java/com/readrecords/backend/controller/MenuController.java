package com.readrecords.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.readrecords.backend.entity.ReadRecords;
import com.readrecords.backend.form.ReadRecordsForm;
import com.readrecords.backend.service.BackendService;

// 初期メニューへ遷移させるためのController
@Controller
public class MenuController {
  @Autowired
  BackendService service;
  @RequestMapping("/menu")
  @GetMapping
  public String showMenu() {
    return "menu";
  }
  @RequestMapping("/showRecords")
  @GetMapping
  public String showAllReadRecords(ReadRecordsForm readRecordsForm, Model model){
    Iterable<ReadRecords> readRecords = service.findAll();
    model.addAttribute("readrecords", readRecords);
    return "show";
  }

  @RequestMapping("/searchBooks")
  @GetMapping
  public String showSearchWindow(){
  return "search";
  }
}
