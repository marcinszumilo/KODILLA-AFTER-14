package com.kodilla.good.patterns.productorderservice;

public class PaymentService {
    public boolean receivePayment (double amount) {
        if (amount > 10) {
            return true;
        }
        else {
            return false;
        }
    }
}
