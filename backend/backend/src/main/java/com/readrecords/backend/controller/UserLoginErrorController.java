package com.readrecords.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login_error")
public class UserLoginErrorController {
  @GetMapping
  public String showLoginError(){
    return "user_login_error";
  }
}
