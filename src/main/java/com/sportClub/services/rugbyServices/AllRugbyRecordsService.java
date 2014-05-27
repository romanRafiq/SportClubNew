/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportClub.services.rugbyServices;

import com.sportClub.domain.Model.classes.ImmutableClasses.Sport_records.Rugby_Records;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface AllRugbyRecordsService {
    public List<Rugby_Records> getAll();
}
