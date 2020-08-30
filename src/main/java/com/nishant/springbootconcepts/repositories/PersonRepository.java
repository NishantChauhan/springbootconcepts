package com.nishant.springbootconcepts.repositories;

import com.nishant.springbootconcepts.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person,String> {

    Optional<Person> findById(Integer id);
    List<Person> findAll();
}
