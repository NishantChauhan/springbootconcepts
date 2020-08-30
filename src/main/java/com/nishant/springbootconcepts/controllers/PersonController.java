package com.nishant.springbootconcepts.controllers;

import com.nishant.springbootconcepts.components.PersonComponent;
import com.nishant.springbootconcepts.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {


    PersonComponent personComponent;

    @Autowired
    public void setPersonComponent(PersonComponent personComponent) {
        this.personComponent = personComponent;
    }

    @GetMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getAllPersons (){
        return personComponent.getAllPersons();
    }

    @PostMapping(value = "/person",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Person addPerson(@RequestBody Person person){
        return personComponent.addPerson(person);
    }

    @PostMapping(value = "/persons",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPersons(@RequestBody Person[] persons){
        personComponent.addPersons(persons);
    }

}
