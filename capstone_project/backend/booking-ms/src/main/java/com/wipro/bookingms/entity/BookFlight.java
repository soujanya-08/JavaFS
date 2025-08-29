package com.wipro.bookingms.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
public class BookFlight {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="booking_id")
    private String bookingId;
    
    @Column(name="flight_number")
    private String flightNumber;
    
    @Column(name="passenger_name")
    private String passengerName;
    
    @Column(name="email")
    private String email;
    
    @Column(name="amount")
    private Double amount;
    
    @Column(name="status")
    private String status;
    
    public BookFlight(Long id, String bookingId, String flightNumber, String passengerName, String email, Double amount,
			String status) {
		super();
		this.id = id;
		this.bookingId = bookingId;
		this.flightNumber = flightNumber;
		this.passengerName = passengerName;
		this.email = email;
		this.amount = amount;
		this.status = status;
	}
    
}