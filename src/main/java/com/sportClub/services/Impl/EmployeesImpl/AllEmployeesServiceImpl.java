/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.Impl.EmployeesImpl;

import com.sportClub.domain.Model.classes.ImmutableClasses.Employees.Other_Employees;
import com.sportClub.repository.EmployeesRepository;
import com.sportClub.services.employeeServices.AllEmployeesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class AllEmployeesServiceImpl implements  AllEmployeesService{

     @Autowired 
    private EmployeesRepository employeesRepository;
     
    @Override
    public List<Other_Employees> getEmployees() {
        return employeesRepository.findAll();
    }
    
    
}
