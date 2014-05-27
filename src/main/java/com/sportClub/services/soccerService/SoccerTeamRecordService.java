/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.soccerService;

import com.sportClub.domain.Model.classes.ImmutableClasses.Sport_records.Soccer_records;

/**
 *
 * @author Roman
 */
public interface SoccerTeamRecordService {
    public Soccer_records getSoccerRecord(String division,String ageGroup);
}
