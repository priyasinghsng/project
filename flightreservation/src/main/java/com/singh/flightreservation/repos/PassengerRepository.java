package com.singh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.singh.flightreservation.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
