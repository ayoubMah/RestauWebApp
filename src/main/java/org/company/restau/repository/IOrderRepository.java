package org.company.restau.repository;

import org.company.restau.model.MenuItem;

public interface IOrderRepository {
    // Methods
    public void addMenuItem(MenuItem menuItem) ;

    public void removeMenuItem(MenuItem menuItem) ;
}



