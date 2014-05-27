/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.employeeServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.Employees.Coach;


/**
 *
 * @author Roman
 */
public interface CoachService {
    public Coach getCoachOfTeam(String sport,String division,int ageGroup);
}
