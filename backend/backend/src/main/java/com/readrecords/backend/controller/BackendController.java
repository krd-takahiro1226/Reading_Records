package com.readrecords.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
