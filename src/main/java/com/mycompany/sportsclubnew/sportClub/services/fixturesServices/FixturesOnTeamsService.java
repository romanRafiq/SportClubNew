/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.fixturesServices;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Sport_Fixtures;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface FixturesOnTeamsService {
    public List<Sport_Fixtures> getSportFixtures(String sportType,String ageGroups);
}
