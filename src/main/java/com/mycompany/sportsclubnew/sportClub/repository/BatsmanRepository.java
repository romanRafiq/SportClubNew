/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.repository;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.PlayerRecords.Batsman_runs;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Roman
 */
public interface BatsmanRepository extends JpaRepository<Batsman_runs,Long>{
    
}
