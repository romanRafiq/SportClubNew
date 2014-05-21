/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.Impl.cricketServiceImpl;

import com.Model.classes.ImmutableClasses.PlayerRecords.Batsman_runs;
import com.sportsClub.repository.BatsmanRepository;
import com.sportsClub.services.cricketServices.BatsmansGamesPlayedService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class batsmanGamesPlayedServiceImpl implements BatsmansGamesPlayedService{
 
    @Autowired
    private BatsmanRepository batsmanRepository;
    
    @Override
    public List<Batsman_runs> getPlayersGamesPlayedAbove(int above) {
        
       List<Batsman_runs> batsmans = new ArrayList<>();        
       List<Batsman_runs> allBatsmans = batsmanRepository.findAll();
       
       for(Batsman_runs batsman :allBatsmans )
       {
           if(batsman.getaGamesPlayed() > above)
           {
               batsmans.add(batsman);
           }
       }       
       
       return batsmans;
    }
    
}
