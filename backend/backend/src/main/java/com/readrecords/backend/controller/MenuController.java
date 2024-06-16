package com.readrecords.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 初期メニューへ遷移させるためのController
@Controller
public class MenuController {
  @RequestMapping("/menu")
  @GetMapping
  public String showMenu() {
    return "menu";
  }
}
