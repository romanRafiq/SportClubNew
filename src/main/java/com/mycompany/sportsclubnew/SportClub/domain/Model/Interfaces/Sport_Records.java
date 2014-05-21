/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.Interfaces;

/**
 *
 * @author Roman
 */
public interface Sport_Records {
    //should add Sport also as a string
    public String getDivision();
    public int getAgeGroup();
    public int getWins();
    public int getLoses();
    public int getDraws();     
    public String toString();
}
