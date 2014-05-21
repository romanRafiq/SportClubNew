/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SportClub.repository;

import com.Model.classes.ImmutableClasses.Employees.Other_Employees;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Roman
 */
public interface EmployeesRepository extends JpaRepository<Other_Employees,Long> {
    
}
