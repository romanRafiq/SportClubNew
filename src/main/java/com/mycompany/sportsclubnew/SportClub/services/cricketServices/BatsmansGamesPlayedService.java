/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.cricketServices;

import com.Model.classes.ImmutableClasses.PlayerRecords.Batsman_runs;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface BatsmansGamesPlayedService {
    public List <Batsman_runs> getPlayersGamesPlayedAbove(int above);
    
}
