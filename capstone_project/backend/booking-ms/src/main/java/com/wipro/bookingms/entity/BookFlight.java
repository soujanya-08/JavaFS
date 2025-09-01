package com.wipro.bookingms.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor 
public class BookFlight {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="booking_id", nullable = false, unique = true)
    private String bookingId;
    
    @Column(name="flight_number",nullable = false)
    private String flightNumber;
    
    @Column(name="passenger_name",nullable = false)
    private String passengerName;
    
    @Column(name="email",nullable = false)
    private String email;
    
    @Column(name="amount",nullable = false)
    private Double amount;
    
    @Column(name="status",nullable = false)
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