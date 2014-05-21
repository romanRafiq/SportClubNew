/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services;

import com.Model.classes.ImmutableClasses.Person;

/**
 *
 * @author Roman
 */
public interface PersonDetailsService {
    public Person getPersonalDetails(String IdNumber);
    
}
