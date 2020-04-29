package com.singh.flightreservation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Reservation extends AbstractEntity  {

	@Column(name="CHECKED_IN")
	private Boolean checkedIn;
	@Column(name="NUMBER_OF_BAGS")
	private int noOfBags;
	@Autowired
	@OneToOne
	@JoinColumn(name="PASSENGER")
	private Passenger passenger;
	@OneToOne
	@JoinColumn(name="FLIGHT")
	private Flight flight;
	
	
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNoOfBags() {
		return noOfBags;
	}
	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
