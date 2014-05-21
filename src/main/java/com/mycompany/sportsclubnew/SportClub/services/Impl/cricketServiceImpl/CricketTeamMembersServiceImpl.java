/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.Impl.cricketServiceImpl;

import com.Model.classes.ImmutableClasses.Players.Cricket_player;
import com.sportsClub.repository.CricketPlayerRepository;
import com.sportsClub.services.cricketServices.CricketTeamMembersService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class CricketTeamMembersServiceImpl implements CricketTeamMembersService{
    
    @Autowired
    private CricketPlayerRepository cricketPlayerRepository;

    @Override
    public List<Cricket_player> getTeamMembers(String division, int ageGroup) {
        
        
       List<Cricket_player> cricketPlayers = new ArrayList<>();
         
         List<Cricket_player> allCricketPlayers = cricketPlayerRepository.findAll();
       
       for(Cricket_player cricketPlayer : allCricketPlayers)
       {
           if((cricketPlayer.getDivision().equals(division)) && (cricketPlayer.getAgeGroup() == ageGroup) )
           {
               cricketPlayers.add(cricketPlayer);               
           }
       }
        return cricketPlayers;
    }
}
