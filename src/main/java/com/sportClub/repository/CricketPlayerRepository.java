/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.repository;


import com.sportClub.domain.Model.classes.ImmutableClasses.Players.Cricket_player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Roman
 */

public interface CricketPlayerRepository extends JpaRepository<Cricket_player,Long>{
        
}
