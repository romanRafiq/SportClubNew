/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.Impl.cricketServiceImpl;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.PlayerRecords.Batsman_runs;
import com.mycompany.sportsclubnew.sportClub.repository.BatsmanRepository;
import com.mycompany.sportsclubnew.sportClub.services.cricketServices.BatsmansRunsaboveService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roman
 */
@Service
public class BatsmansRunsaboveServiceImpl implements BatsmansRunsaboveService{

     @Autowired 
    private BatsmanRepository batsmanRepository;
    @Override
    public List<Batsman_runs> getPlayersWithRunsAbove(int above) {
        
       List<Batsman_runs> batsmans = new ArrayList<>();        
       List<Batsman_runs> allBatsmans = batsmanRepository.findAll();
       
       for(Batsman_runs batsman :allBatsmans )
       {
           if(batsman.getRuns()> above)
           {
               batsmans.add(batsman);
           }
       }       
       
       return batsmans;
    }
    
}
