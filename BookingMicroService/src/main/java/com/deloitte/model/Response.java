package com.deloitte.model;

import java.util.List;

import com.deloitte.entity.Booking;



public class Response {

	private Booking booking;
	private List<Services> bookings;
	public Response(Booking booking, List<Services> bookings) {
		super();
		this.booking = booking;
		this.bookings = bookings;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public List<Services> getBookings() {
		return bookings;
	}
	public void setBookings(List<Services> bookings) {
		this.bookings = bookings;
	}
	
}
