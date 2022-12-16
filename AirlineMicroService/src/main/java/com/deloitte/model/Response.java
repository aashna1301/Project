package com.deloitte.model;

import java.util.List;

import com.deloitte.entity.Airline;

public class Response {
	
	private Airline airline;
	private List<Booking> bookings;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Airline airline, List<Booking> bookings) {
		super();
		this.airline = airline;
		this.bookings = bookings;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	
	

}
