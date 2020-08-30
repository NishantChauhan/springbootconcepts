package com.nishant.springbootconcepts.components;

import com.nishant.springbootconcepts.entities.Person;
import com.nishant.springbootconcepts.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PersonComponent {
    PersonService service;

    @Autowired
    public void setService(PersonService service) {
        this.service = service;
    }

    public List<Person> getAllPersons (){
        return service.getAllPersons();
    }

    public Person addPerson(Person person) {
        return service.addPerson(person);
    }
    public void addPersons(@NonNull Person[] persons){
        service.addPersons(Arrays.asList(persons));
    }
}
