package com.wipro.orderms.dto;

import lombok.Data;

@Data
public class Payment {
    private int id;
    private int orderId;
    private boolean paymentStatus;
    private double paymentAmount;
}
