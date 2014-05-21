/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.soccerService;

import com.Model.classes.ImmutableClasses.Players.Soccer_player;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface SoccerTeamMembersService {
 public List<Soccer_player>   getSoccerTeamMembers(String division, String ageGroup);
}
