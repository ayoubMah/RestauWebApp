package org.company.restau.repository;

import org.company.restau.model.Bill;

public interface IBillRepository {
    public void pay();

    public void cancelPayment();


    Optional<Bill> findById(Long billId);

    Bill save(Bill bill);
}

