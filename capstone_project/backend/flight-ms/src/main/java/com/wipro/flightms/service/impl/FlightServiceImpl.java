package com.wipro.flightms.service.impl;
import com.wipro.flightms.entity.Flight;
import com.wipro.flightms.repo.FlightRepository;
import com.wipro.flightms.service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
	FlightRepository repo;

    @Override
    public List<Flight> searchFlights(String source, String destination, LocalDate travelDate) {
        return repo.findBySourceAndDestinationAndTravelDate(source, destination, travelDate);
    }

    @Override
    public Flight addFlight(Flight flight) {
        return repo.save(flight);
    }
    
    @Override
    public List<Flight> getAllFlights() {
        return repo.findAll();
    }
    
    @Override
    public Flight getFlightById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Flight not found"));
    }
    
    @Override
    public Flight updateFlight(Long id, Flight updatedFlight) {
        Flight flight = getFlightById(id);
        flight.setFlightNumber(updatedFlight.getFlightNumber());
        flight.setAirline(updatedFlight.getAirline());
        flight.setSource(updatedFlight.getSource());
        flight.setDestination(updatedFlight.getDestination());
        flight.setTravelDate(updatedFlight.getTravelDate());
        flight.setPrice(updatedFlight.getPrice());
        return repo.save(flight);
    }
    @Override
    public void deleteFlight(Long id) {
        repo.deleteById(id);
    }
    
}