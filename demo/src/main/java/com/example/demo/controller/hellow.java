package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellow {
    @RequestMapping("/hello")
    public String hello() {return "声纹识别项目";}
}
