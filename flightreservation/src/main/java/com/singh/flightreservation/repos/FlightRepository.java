package com.singh.flightreservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.singh.flightreservation.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query("from Flight where departureCity=:x and arrivalCity=:y and dateOfDeparture=:z")
	List<Flight> findFlights(@Param("x")String from, @Param("y")String to, 
			@Param("z")Date departureDate);

}
