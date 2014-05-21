/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.Impl;

import com.Model.classes.ImmutableClasses.Person;
import com.sportsClub.repository.PersonRepository;
import com.sportsClub.services.PersonDetailsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class PersonDetailsServiceImpl implements PersonDetailsService{

    @Autowired
    private PersonRepository personRepository;
    
    @Override
    public Person getPersonalDetails(String IdNumber) {
      // List<Person> persons = new ArrayList<>();
       List<Person> allPersons = personRepository.findAll();
       
       for(Person person : allPersons)
       {
           if(person.getID().equals(IdNumber))
           {
               return person;
           }
       }
       return null;
    }
    
}
