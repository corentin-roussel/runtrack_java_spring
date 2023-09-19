package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {

    public String message = "Hello everyone!";

    @Value("${custom.greeting.message}")
    private String greetingMessage;

    @GetMapping("/greeting")
    public String getGreetingMessage() {
        return greetingMessage;
    }

    @GetMapping("/")
    public String view() {
        return "view";
    }


    @GetMapping("/message")
    public String newMessage() {
        return "its the return of the new message";
    }

}