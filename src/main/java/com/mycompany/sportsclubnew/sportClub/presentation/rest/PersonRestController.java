/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubnew.sportClub.presentation.rest;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Roman
 */
@Controller // Annotation to make this class be detectable by the config as a controller
@RequestMapping(value = "api/person") // This the url e.g http://localhost:8084/sportsclubnew/api/club
public class PersonRestController {
  
     @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody Person person) {
        System.out.println(" Create the Called ");
        return "";
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestBody Person person) {
        System.out.println(" Update Called ");
        return "";
    }

    @RequestMapping(value = "person/{id}")
    @ResponseBody
    public Person getPerson(@PathVariable int id) {
        System.out.println(" ID called ");
        return null;
    }

    @RequestMapping(value = "persons")
    @ResponseBody
    public List<Person> getPersons() {
        System.out.println("The CLUBS");
        return null;
    }

    @RequestMapping(value = "person/{name}")
    @ResponseBody
    public Person getPersonyName(@PathVariable String id) {
        System.out.println("The person Name name");
        return null;
    }
    
    
}
