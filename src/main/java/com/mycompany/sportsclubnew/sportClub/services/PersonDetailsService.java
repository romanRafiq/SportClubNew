/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Person;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface PersonDetailsService{
    public Person getPersonalDetails(int IdNumber);
    public List<Person> getAgeAbove(int i);
    public List<Person> findAll();
    
}
