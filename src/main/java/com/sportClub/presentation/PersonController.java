/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sportClub.presentation;

import com.sportClub.domain.Model.classes.ImmutableClasses.Person;
import com.sportClub.services.PersonDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author Roman
 */
public class PersonController {
    
    @Autowired  
    private PersonDetailsService personDetailsService;

    @RequestMapping(value = "person")
    @ResponseBody
    public Person getPerson() {
        Person p = null;
        List<Person> persons = personDetailsService.findAll();

        System.out.println(" THE COllection Size" + persons.size());

        if (persons.size() > 0) {
            p = persons.get(0);

        }

        return p;
    }
    
    
    @RequestMapping(value = "persons")
    @ResponseBody
    public List<Person> getPersons() {
        return personDetailsService.findAll();

    }
}
