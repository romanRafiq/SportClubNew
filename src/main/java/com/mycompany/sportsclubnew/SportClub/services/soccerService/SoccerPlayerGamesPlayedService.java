/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.soccerService;

import com.Model.classes.ImmutableClasses.PlayerRecords.goal_Scorers;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface SoccerPlayerGamesPlayedService {
    public List<goal_Scorers> getPlayerGamesPlayed();
}
