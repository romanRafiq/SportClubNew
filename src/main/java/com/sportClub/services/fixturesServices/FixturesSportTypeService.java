/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.fixturesServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.Sport_Fixtures;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface FixturesSportTypeService {
    public List<Sport_Fixtures> getSportFixtures(String sportType);
}
