/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.Impl.cricketServiceImpl;

import com.Model.classes.ImmutableClasses.Sport_records.Cricket_records;
import com.sportsClub.repository.CricketRecordsRepository;
import com.sportsClub.services.cricketServices.CricketRecordSevice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class CricketRecordServiceImpl implements CricketRecordSevice{

     @Autowired 
    private CricketRecordsRepository cricketRecordsRepository;
     
    @Override
    public Cricket_records getCricketRecord(String division, int ageGroup) {
        
         List<Cricket_records> allCricketRecords = cricketRecordsRepository.findAll();
       
       for(Cricket_records cricketRecord : allCricketRecords)
       {
           if((cricketRecord.getDivision().equals(division)) && (cricketRecord.getAgeGroup() == ageGroup))
           {
               return cricketRecord;
           }
       }
       return null;
    }

}
