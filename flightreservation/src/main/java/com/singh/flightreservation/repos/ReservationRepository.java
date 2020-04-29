package com.singh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.singh.flightreservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
