package com.singh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.singh.flightreservation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);

}
