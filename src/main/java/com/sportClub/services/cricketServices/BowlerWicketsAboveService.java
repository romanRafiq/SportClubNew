/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.cricketServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.PlayerRecords.BowlerWickets;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface BowlerWicketsAboveService {
    public List<BowlerWickets> getListPlayerWicketsAbove(int above);
}
