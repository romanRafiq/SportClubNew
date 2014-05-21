/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsClub.services.soccerService;

import com.Model.classes.ImmutableClasses.Sport_records.Soccer_records;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface AllSoccerTeamRecordsService {
 public List<Soccer_records> getAll();   
}
