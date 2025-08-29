package com.wipro.flightpaymentms.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long bookingId;
    private Double amount;
    private String mode;  // CARD, UPI, etc.
    private String status; // SUCCESS, FAILED
}