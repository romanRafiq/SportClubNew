/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.rugbyServices;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.PlayerRecords.Try_Scorers;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface RugbyGamesPlayedService {
    public List<Try_Scorers> getGamesPlayedAbove(int above);
}
