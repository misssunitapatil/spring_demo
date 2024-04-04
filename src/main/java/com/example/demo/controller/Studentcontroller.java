package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Studentcontroller {
    @GetMapping("/get")
    public String TestAPI() {
        return "Hello world";
    }
    @GetMapping("/post")
    public String Cat() {
        return "Welcome";
    }
    }


