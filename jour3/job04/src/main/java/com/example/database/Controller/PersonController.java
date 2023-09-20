package com.example.database.Controller;

import org.springframework.ui.Model;
import com.example.database.Class.Person;
import com.example.database.Service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/user")
    public String findAll(Model model) {
        model.addAttribute("person", personService.findAll());
        return "user";
    }
    @PostMapping("/create")
    public String createPerson(@RequestParam String name, @RequestParam String age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(Integer.parseInt(age));

        personService.addPerson(person);

        return "redirect:/user";
    }


}
