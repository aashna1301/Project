package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.entity.Airline;
import com.deloitte.repository.AirlineRepository;

@Service
public class AirlineServiceImpl implements AirlineService{
	
	@Autowired
	private AirlineRepository airlineRepository;

	@Override
	public Airline getAirline(Integer id) {
		
		return airlineRepository.findById(id).get();
	}

	@Override
	public List<Airline> getAirlines() {
		
		return airlineRepository.findAll();
	}

	@Override
	public List<Airline> getAirlineByDepCity(String dcity) {
		  
		return airlineRepository.findByDepCity(dcity);
				
	}

	@Override
	public List<Airline> getAirlineByArrCity(String aCity) {
		
		return airlineRepository.findByArrCity(aCity);
	}
	
	
	

	
	

}
