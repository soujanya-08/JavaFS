package com.wipro.flightms.repo;

import com.wipro.flightms.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	List<Flight> findBySourceAndDestinationAndTravelDate(String source, String destination, LocalDate travelDate);
	}
