/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.Impl.EmployeesImpl;

import com.sportClub.domain.Model.classes.ImmutableClasses.Employees.Coach;
import com.sportClub.repository.CoachRepository;
import com.sportClub.services.employeeServices.AllCoachesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class AllCoachesServicesImpl implements AllCoachesService{

     @Autowired 
    private CoachRepository coachRepository;
     
    @Override
    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }
    
}
