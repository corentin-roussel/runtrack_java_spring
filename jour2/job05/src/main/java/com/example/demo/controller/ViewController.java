package com.example.demo.controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class ViewController {

    public static String message = "Hello everyone!";
    public static String formMessage;



    @GetMapping("/view")
    public String view() {
        return "view";
    }

    @PostMapping("/view")
    public void display(@RequestParam String name, @RequestParam String age) {
        if(name.isEmpty() || age.isEmpty()) {
            formMessage = ("Please set all the input");
        }else {
            formMessage =("Hello, " + name + ". You are " + age + " years old");
        }
    }


}