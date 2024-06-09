package com.readrecords.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.readrecords.backend.repository.UserLoginRepostoty;
import com.readrecords.backend.service.UserLoginDetailsService;

@Controller
@RequestMapping("/login")
public class UserLoginController {
  @Autowired
  UserLoginDetailsService userLoginDetailsService;
  @Autowired
  PasswordEncoder passwordEncoder;
  @Autowired
  UserLoginRepostoty userLoginRepostoty;
  @RequestMapping(method = RequestMethod.GET)
  public String showLoginWindow() {
    return "user_login";
  }
  @RequestMapping(method = RequestMethod.POST)
  public String executeLogin(String username, String password, Model model) {
    String collectPassword = userLoginRepostoty.findPasswordByUsername(username);
    if (passwordEncoder.matches(password, collectPassword)) {
      return "redirect:/show";
    }
    else
      return "redirect:/user_login";
  }
}
