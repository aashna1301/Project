package com.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.entity.Booking;
import com.deloitte.model.Response;
import com.deloitte.model.Services;
import com.deloitte.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAllBookings")
	public ResponseEntity<List<Booking>> getBookings(){
		
		List<Booking> bookingList = bookingService.getBookings();
		return new ResponseEntity<List<Booking>>(bookingList, HttpStatus.OK);
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Booking> getBookingById(@PathVariable("id") Integer id){
		Booking booking = bookingService.getBookingById(id);
		return new ResponseEntity<Booking>(booking,HttpStatus.OK);
	}
	
	@GetMapping("/name")
	public ResponseEntity<Booking> getBookingByName(@RequestParam String name){
		Booking booking = bookingService.getBookingByName(name);
		return new ResponseEntity<Booking>(booking,HttpStatus.OK);
	}
	
	@GetMapping("/service")
	public ResponseEntity<Response> getServiceByBooking(@PathVariable("id") Integer id){
		
		Booking booking = bookingService.getBookingById(id);
		List<Services> serviceList = restTemplate.getForObject("http:localhost:8083/services/getService" + id, List.class);
		Response response = new Response(booking,serviceList);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
			
	}
	
	

}
