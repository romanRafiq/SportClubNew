
package com.sportsClub.services;

import java.util.List;

/**
 *
 * @author Roman
 */
public interface Services<S,ID> {
    public S Find(ID id);
    public S persist(S entity);
    public S merge(S entity);
    public void remove(S entity);
    public List<S> findAll();
    
}
