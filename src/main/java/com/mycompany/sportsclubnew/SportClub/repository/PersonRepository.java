/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SportClub.repository;

import com.Model.classes.ImmutableClasses.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Roman
 */
public interface PersonRepository extends JpaRepository<Person,Long>{
    
}
