/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.Impl;

import com.sportClub.domain.Model.classes.ImmutableClasses.Person;
import com.sportClub.repository.PersonRepository;
import com.sportClub.services.PersonDetailsService;
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
    public Person getPersonalDetails(int IdNumber) {
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

    @Override
    public List<Person> getAgeAbove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
