package com.example.database.Service;

import com.example.database.Class.Person;
import com.example.database.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public Person findOnePerson(String name) {
        return personRepository.findByNameIs(name);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

}
