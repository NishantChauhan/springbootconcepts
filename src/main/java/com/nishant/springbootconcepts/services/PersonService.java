package com.nishant.springbootconcepts.services;

import com.nishant.springbootconcepts.entities.Person;
import com.nishant.springbootconcepts.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repo;

    @Transactional
    public List<Person> getAllPersons(){
        return repo.findAll();
    }

}
