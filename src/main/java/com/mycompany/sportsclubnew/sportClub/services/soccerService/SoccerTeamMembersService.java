/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.soccerService;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Players.Soccer_player;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface SoccerTeamMembersService {
 public List<Soccer_player>   getSoccerTeamMembers(String division, String ageGroup);
}
