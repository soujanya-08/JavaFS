package com.wipro.bookingms.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import java.util.Collections;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.bookingms.dto.FlightDTO;

@FeignClient(name = "flight-ms")
public interface FlightClient {

    @GetMapping("/flight/{id}")
    @CircuitBreaker(name = "flightService", fallbackMethod = "getFlightFallback")
    FlightDTO getFlightById(@PathVariable("id") Long id);

    // fallback method
    default FlightDTO getFlightFallback(Long id, Throwable throwable) {
        FlightDTO fallback = new FlightDTO();
        fallback.setId(id);
        fallback.setAirline("N/A");
        fallback.setFlightNumber("N/A");
        fallback.setSource("N/A");
        fallback.setDestination("N/A");
        fallback.setPrice(0.0);
        return fallback;
    }
    
    @GetMapping("/flight")
    @CircuitBreaker(name = "flightService", fallbackMethod = "getAllFlightsFallback")
    List<FlightDTO> getAllFlights();

    default List<FlightDTO> getAllFlightsFallback(Throwable throwable) {
        return Collections.emptyList(); // or any fallback list
    }

}