/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SportClub.repository;

import com.Model.classes.ImmutableClasses.Sport_records.Cricket_records;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Roman
 */
public interface CricketRecordsRepository extends JpaRepository<Cricket_records,Long> {
    
}
