package com.example.demo.controller;

import com.example.demo.Classes.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class ViewController {

    public String message = "Hello everyone!";

    public static List<Person> persons = Arrays.asList(
            new Person("Corentin", "Roussel", "26"),
            new Person("Anaïs", "Gilg", "27"),
            new Person("Fabien", "Ricca", "29")
    );

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