package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${custom.greeting.message}")
    private String greetingMessage;

       @GetMapping("/greeting")
    public String getGreetingMessage() {
        return greetingMessage;
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello World !";
    }

}