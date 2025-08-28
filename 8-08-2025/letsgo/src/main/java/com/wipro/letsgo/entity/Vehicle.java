package com.wipro.letsgo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vehicle")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="vehicle_id")
    private Long vehId;
    
    @Column(name="latitude")
    private double lat;

    @Column(name = "longitude")
    private double lng;
}
