package com.readrecords.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.readrecords.backend.service.UserLoginDetailsService;

@Controller
@RequestMapping("/login")
public class UserLoginController {
  @Autowired
  UserLoginDetailsService userLoginDetailsService;
  @GetMapping
  public UserDetails loadUserByUsername(String username) {
    return userLoginDetailsService.loadUserByUsername(username);
  }
  @GetMapping
  public String login() {
    return "login";
  }
  
}
