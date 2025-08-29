package com.wipro.bookingms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bookingms.entity.BookFlight;

public interface BookFlightRepo extends JpaRepository<BookFlight,Long> {

}
