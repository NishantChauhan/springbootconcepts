package com.nishant.springbootconcepts;

import com.nishant.springbootconcepts.entities.Person;
import com.nishant.springbootconcepts.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class SpringBootConceptsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConceptsApplication.class, args);
    }

}
