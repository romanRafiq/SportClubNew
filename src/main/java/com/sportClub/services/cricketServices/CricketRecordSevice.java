/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.cricketServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.Sport_records.Cricket_records;

/**
 *
 * @author Roman
 */
public interface CricketRecordSevice {
    public Cricket_records getCricketRecord(String division,int ageGroup);
}
