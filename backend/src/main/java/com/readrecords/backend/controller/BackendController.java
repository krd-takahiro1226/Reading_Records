package com.readrecords.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.readrecords.backend.entity.ReadRecords;
import com.readrecords.backend.form.ReadRecordsForm;
import com.readrecords.backend.service.BackendService;


@Controller
@RequestMapping("/api/v1/readrecords")
public class BackendController {
  @Autowired
  BackendService service;
  @ModelAttribute
  public ReadRecordsForm setReadRecordsForm(){
    ReadRecordsForm readRecordForm = new ReadRecordsForm();
    readRecordForm.setRead_count(0);
    return readRecordForm;
  }
  @GetMapping
  public String showAllReadRecords(ReadRecordsForm readRecordsForm, Model model){
    Iterable<ReadRecords> readRecords = service.findAll();
    model.addAttribute("readrecords", readRecords);
    return "show";
  }

}
