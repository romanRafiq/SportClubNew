/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.employeeServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.Employees.Other_Employees;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface AllEmployeesService {
    public List<Other_Employees> getEmployees();
}
