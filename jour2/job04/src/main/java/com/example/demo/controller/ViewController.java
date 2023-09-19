package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {

    public static String message = "Hello everyone!";
    public static String formMessage;

    @Value("${custom.greeting.message}")
    private String greetingMessage;


    @GetMapping("/view")
    public String view() {
        return "view";
    }

    @PostMapping("/view")
    public void display(@RequestParam String name) {
        formMessage = "Hello, " + name + " how are you ?";
    }

}