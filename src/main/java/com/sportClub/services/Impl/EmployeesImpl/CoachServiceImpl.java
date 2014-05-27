/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.Impl.EmployeesImpl;

import com.sportClub.domain.Model.classes.ImmutableClasses.Employees.Coach;
import com.sportClub.repository.CoachRepository;
import com.sportClub.services.employeeServices.CoachService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class CoachServiceImpl implements CoachService{

     @Autowired 
    private CoachRepository coachRepository;
     
    @Override
    public Coach getCoachOfTeam(String sport, String division, int ageGroup) {
        
        List<Coach> coaches = coachRepository.findAll();
        
        for(Coach coach : coaches)
        {
            if((coach.getSport().equals(sport)) && (coach.getDivision().equals(division)))
            {
                if(coach.getAgeGroup() == ageGroup)
                {
                    return coach;
                }
            }
        }
        
        
        return null;
    }
    
    
}
