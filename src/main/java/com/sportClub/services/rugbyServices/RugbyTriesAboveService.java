/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.rugbyServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.PlayerRecords.Try_Scorers;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface RugbyTriesAboveService {
    public List<Try_Scorers> getTrieScorersAbove(int above);
}
