package com.readrecords.backend.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.readrecords.backend.dto.UserReadRecordsDto;
import com.readrecords.backend.security.UserLoginDetails;
import com.readrecords.backend.service.ReadRecordsService;

// 初期メニューから各種機能へ遷移させるためのController
@Controller
public class MenuController {
  private static final Logger logger = LoggerFactory.getLogger(BackendController.class);
  @Autowired
  ReadRecordsService readRecordsService;
  @RequestMapping("/showRecords")
  @GetMapping
  public String showAUserReadRecords(Model model) {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    UserLoginDetails userDetails = (UserLoginDetails) authentication.getPrincipal();
    String userId = userDetails.getUserId();
    // System.out.println("ユーザーID: " + userId);
    // ここでレコードが取れていないため、何も表示されない
    List<UserReadRecordsDto> readRecords = readRecordsService.getReadRecordsByUserId(userId);
    model.addAttribute("readRecords", readRecords);
    return "show";
  }

  @RequestMapping("/searchBooks")
  @GetMapping
  public String showSearchWindow(){
  return "search";
  }
}
