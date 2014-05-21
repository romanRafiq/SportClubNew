/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SportClub.repository;

import com.Model.classes.ImmutableClasses.Employees.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Roman
 */
public interface CoachRepository extends JpaRepository<Coach,Long>{
    
}
