package com.wipro.bookingms.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import java.util.Collections;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.bookingms.dto.FlightDTO;

@FeignClient(name = "flight-ms")
public interface FlightClient {

	@GetMapping("/flight/search")
    @CircuitBreaker(name = "flightService", fallbackMethod = "searchFlightsFallback")
    List<FlightDTO> searchFlights(
        @RequestParam("source") String source,
        @RequestParam("destination") String destination,
        @RequestParam("travelDate") String travelDate
    );

    default List<FlightDTO> searchFlightsFallback(String source, String destination, String travelDate, Throwable throwable) {
    System.out.println("Flight server is down");    
    	return Collections.emptyList();
    }
	  
    @GetMapping("/flight/{id}")
    @CircuitBreaker(name = "flightService", fallbackMethod = "getFlightFallback")
    FlightDTO getFlightById(@PathVariable("id") Long id);

    default FlightDTO getFlightFallback(Long id, Throwable throwable) {
        FlightDTO fallback = new FlightDTO();
        fallback.setId(id);
        fallback.setAirline("N/A");
        fallback.setFlightNumber("N/A");
        fallback.setSource("N/A");
        fallback.setDestination("N/A");
        fallback.setPrice(0.0);
        System.out.println("Flight server is down"); 
        return fallback;
    }
    
    @GetMapping("/flight")
    @CircuitBreaker(name = "flightService", fallbackMethod = "getAllFlightsFallback")
    List<FlightDTO> getAllFlights();

    default List<FlightDTO> getAllFlightsFallback(Throwable throwable) {
    	System.out.println("Flight server is down"); 
        return Collections.emptyList();
    }
    

}