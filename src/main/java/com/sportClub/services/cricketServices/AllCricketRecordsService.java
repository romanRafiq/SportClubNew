/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.cricketServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.Sport_records.Cricket_records;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface AllCricketRecordsService {
    public List<Cricket_records> getAllCricketRecords();
}
