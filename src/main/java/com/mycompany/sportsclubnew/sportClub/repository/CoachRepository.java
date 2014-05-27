/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.repository;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Employees.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Roman
 */
public interface CoachRepository extends JpaRepository<Coach,Long>{
    
}
