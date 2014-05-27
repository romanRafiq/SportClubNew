/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.Impl.cricketServiceImpl;

import com.sportClub.domain.Model.classes.ImmutableClasses.Sport_records.Cricket_records;
import com.sportClub.repository.CricketRecordsRepository;
import com.sportClub.services.cricketServices.AllCricketRecordsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class AllCricketRecordsServiceImpl implements AllCricketRecordsService {

    @Autowired
    private CricketRecordsRepository cricketRecordsRepository;
    
    @Override
    public List<Cricket_records> getAllCricketRecords() {
      
        return cricketRecordsRepository.findAll();   
    }
    
}
