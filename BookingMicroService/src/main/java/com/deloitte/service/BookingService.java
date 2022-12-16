package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Booking;

public interface BookingService {
	
	public List<Booking> getBookings();
	public Booking getBookingById(Integer id);
	public Booking getBookingByName(String name);
	public Booking getBookingByService(Integer id);
	
	

}
