package com.connellboyce.springbootreferencematerial.simplewebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/other")
    public String other() {
        return "other";
    }
}
