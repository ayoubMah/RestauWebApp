package org.company.restau.service;

import org.company.restau.model.Bill;
import org.company.restau.repository.IBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillService {

    @Autowired
    private IBillRepository iBillRepository;

    public Bill pay(Long billId) {
        Optional<Bill> optionalBill = iBillRepository.findById(billId);
        if (optionalBill.isPresent()) {
            Bill bill = optionalBill.get();
            // Implement payment logic here
            // For example, update the payment status, process the payment, etc.
            // bill.setPaymentStatus("PAID"); // Assuming there's a paymentStatus field
            return iBillRepository.save(bill);
        } else {
            // Handle the case when the bill is not found
            throw new RuntimeException("Bill not found");
        }
    }

    public Bill cancelPayment(Long billId) {
        Optional<Bill> optionalBill = iBillRepository.findById(billId);
        if (optionalBill.isPresent()) {
            Bill bill = optionalBill.get();
            // Implement payment cancellation logic here
            // For example, revert the payment status, refund, etc.
            // bill.setPaymentStatus("CANCELLED"); // Assuming there's a paymentStatus field
            return iBillRepository.save(bill);
        } else {
            // Handle the case when the bill is not found
            throw new RuntimeException("Bill not found");
        }
    }
