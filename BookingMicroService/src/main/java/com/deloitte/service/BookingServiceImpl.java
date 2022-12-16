package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.entity.Booking;
import com.deloitte.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public List<Booking> getBookings() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	@Override
	public Booking getBookingById(Integer id) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(id).get();
	}

	@Override
	public Booking getBookingByName(String name) {
		// TODO Auto-generated method stub
		return bookingRepository.findByTName(name);
	}

	@Override
	public Booking getBookingByService(Integer id) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(id).get();
	}

}
