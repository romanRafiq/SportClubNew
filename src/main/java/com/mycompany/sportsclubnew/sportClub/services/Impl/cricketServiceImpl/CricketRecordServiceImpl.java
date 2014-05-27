/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.Impl.cricketServiceImpl;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Sport_records.Cricket_records;
import com.mycompany.sportsclubnew.sportClub.repository.CricketRecordsRepository;
import com.mycompany.sportsclubnew.sportClub.services.cricketServices.CricketRecordSevice;
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
