package com.nishant.springbootconcepts.services;

import com.nishant.springbootconcepts.entities.Person;
import com.nishant.springbootconcepts.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {


    PersonRepository repo;

    @Autowired
    public void setRepo(PersonRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public List<Person> getAllPersons(){
        return repo.findAll();
    }

    public Person addPerson(Person person) {
        return  repo.save(person);
    }

    public void addPersons(@NonNull List<Person> persons) {
        repo.saveAll(persons);
    }
}
