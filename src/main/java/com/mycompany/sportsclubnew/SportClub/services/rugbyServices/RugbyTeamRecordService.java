/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.rugbyServices;

import com.Model.classes.ImmutableClasses.Sport_records.Rugby_Records;

/**
 *
 * @author Roman
 */
public interface RugbyTeamRecordService {
    public Rugby_Records getRugbyRecord(String division,String ageGroup);
    
}
