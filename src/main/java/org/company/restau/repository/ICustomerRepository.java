package org.company.restau.repository;

import org.company.restau.model.Order;

public interface ICustomerRepository {

    public void checkIn() ;

    public void checkOut() ;

    public void lastVisited() ;

    public void cancelOrder(Order order) ;

    public void modifyOrder(Order order) ;
}
