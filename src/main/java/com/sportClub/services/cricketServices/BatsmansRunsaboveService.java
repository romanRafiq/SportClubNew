/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.cricketServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.PlayerRecords.Batsman_runs;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface BatsmansRunsaboveService {
    public List<Batsman_runs> getPlayersWithRunsAbove(int above);
}
