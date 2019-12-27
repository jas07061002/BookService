package com.newApp.Sample.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("appName2", "Hello");
        model.addAttribute("appName3", "Hty");
        model.addAttribute("appName4", "huiof");
        model.addAttribute("appName5", "test");
        model.addAttribute("appName6", "youtdfsgdegd");
        return "home";
    }
}