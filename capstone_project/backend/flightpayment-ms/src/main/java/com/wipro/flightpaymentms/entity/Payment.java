package com.wipro.flightpaymentms.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="booking_id")
    private String bookingId;
    
    @Column(name="sender_name")
    private String senderName;
    
    @Column(name="account_number")
    private String accountNumber;
    
    @Column(name="amount")
    private Double amount;
    
    @Column(name="mode")
    private String mode;  
    
    @Column(name="status")
    private String status;
    
    @Column(name="cvv")
    private int cvv; 
  
}