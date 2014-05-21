/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.Impl.cricketServiceImpl;

import com.Model.classes.ImmutableClasses.PlayerRecords.BowlerWickets;
import com.sportsClub.repository.BowlerRepository;
import com.sportsClub.services.cricketServices.BowlerWicketsAboveService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class BowlerWicketsAboveServiceImpl implements BowlerWicketsAboveService{

     @Autowired 
    private BowlerRepository bowlerRepository;
    
     
     @Override
    public List<BowlerWickets> getListPlayerWicketsAbove(int above) {
        
         List<BowlerWickets> bowlers = new ArrayList<>();        
         List<BowlerWickets> allbowler = bowlerRepository.findAll();
       
       for(BowlerWickets bowler :allbowler )
       {
           if(bowler.getaGamesPlayed() > above)
           {
               bowlers.add(bowler);
           }
       }       
       
       
         
         return bowlers;
         
    }
    
}
