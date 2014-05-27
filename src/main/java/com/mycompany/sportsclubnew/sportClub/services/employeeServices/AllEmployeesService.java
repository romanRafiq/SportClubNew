/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.employeeServices;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Employees.Other_Employees;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface AllEmployeesService {
    public List<Other_Employees> getEmployees();
}
