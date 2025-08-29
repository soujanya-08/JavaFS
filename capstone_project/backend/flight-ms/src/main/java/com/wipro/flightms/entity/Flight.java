package com.wipro.flightms.entity;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="flight_number")
    private String flightNumber;
    
    @Column(name="airline")
    private String airline;
    
    @Column(name="source")
    private String source;
    
    @Column(name="destination")
    private String destination;
    
    @Column(name="travel_date")
    private LocalDate travelDate;
    
    @Column(name="price")
    private Double price;
}