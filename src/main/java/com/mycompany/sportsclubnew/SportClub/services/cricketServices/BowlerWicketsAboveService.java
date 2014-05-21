/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.cricketServices;

import com.Model.classes.ImmutableClasses.PlayerRecords.BowlerWickets;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface BowlerWicketsAboveService {
    public List<BowlerWickets> getListPlayerWicketsAbove(int above);
}
