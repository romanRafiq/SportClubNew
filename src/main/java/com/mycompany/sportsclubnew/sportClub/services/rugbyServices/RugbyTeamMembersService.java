/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.rugbyServices;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Players.Rugby_player;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface RugbyTeamMembersService {
    public List<Rugby_player> getRugbyTeamMembers(String division,String ageGroup);
}
