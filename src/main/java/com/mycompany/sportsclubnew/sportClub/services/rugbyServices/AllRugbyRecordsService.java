/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sportsclubnew.sportClub.services.rugbyServices;

import com.mycompany.sportsclubnew.sportClub.domain.Model.classes.ImmutableClasses.Sport_records.Rugby_Records;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface AllRugbyRecordsService {
    public List<Rugby_Records> getAll();
}
