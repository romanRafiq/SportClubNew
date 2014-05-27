/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.cricketServices;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Players.Cricket_player;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface CricketTeamMembersService {
    public List<Cricket_player> getTeamMembers(String division,int ageGroup);
}
