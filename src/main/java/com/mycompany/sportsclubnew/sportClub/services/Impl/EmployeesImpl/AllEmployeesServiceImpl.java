/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.Impl.EmployeesImpl;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Employees.Other_Employees;
import com.mycompany.sportsclubnew.sportClub.repository.EmployeesRepository;
import com.mycompany.sportsclubnew.sportClub.services.employeeServices.AllEmployeesService;
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
