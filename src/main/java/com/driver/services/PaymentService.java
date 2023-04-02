package com.driver.services;

public interface paymentService {
    Payment pay(Integer reservationId, int amountSent, String mode) throws Exception;
}
