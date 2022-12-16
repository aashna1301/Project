package com.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

import com.deloitte.entity.Airline;
import com.deloitte.service.AirlineService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.deloitte.model.*;


@RestController
@RequestMapping("/airlines")
public class AirlineController {
	
	@Autowired
	private AirlineService airlineService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/get/{id}")	
	@HystrixCommand(fallbackMethod = "bookingFailureFallback")
	public ResponseEntity<?> getAirline(@PathVariable("id") Integer id){
		Airline airline = airlineService.getAirline(id);
		List<Booking> bookingList = restTemplate.getForObject("http://localhost:8080/bookings/getBooking/" + id, List.class);
		return new ResponseEntity<Airline>(airline,HttpStatus.OK);		
		
	}
	
	public ResponseEntity<?> bookingFailureFallback(@PathVariable("id") Integer id) {
		
		
		Airline airline = airlineService.getAirline(id);
		FailureResponse response = new FailureResponse(airline,"Currently booking service is down");
		return new ResponseEntity<FailureResponse>(response, HttpStatus.OK);
		
		
	}
	
	@GetMapping("/getAllAirlines")
	public ResponseEntity<List<Airline>> getAirlines(){
		
		List<Airline> airlineList = airlineService.getAirlines();
		return new ResponseEntity<List<Airline>>(airlineList,HttpStatus.OK);
		
	}
	
	@GetMapping("/depCity")
	public ResponseEntity<List<Airline>> getAirlineByDepCity(@RequestParam String depCity){
		
		List<Airline> depAirlineList = airlineService.getAirlineByDepCity(depCity);
		return new ResponseEntity<List<Airline>>(depAirlineList, HttpStatus.OK);
	}
	
	@GetMapping("/arrCity")
	public ResponseEntity<List<Airline>>  getAirlineByArrCity(@RequestParam String arrCity){
		
		List<Airline> arrAirlineList = airlineService.getAirlineByDepCity(arrCity);
		return new ResponseEntity<List<Airline>>(arrAirlineList, HttpStatus.OK);
	}
	
	
	
	
	
	

}
