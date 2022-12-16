package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Airline;

public interface AirlineService {
	
	public Airline getAirline(Integer id);
	public List<Airline> getAirlines();
	public List<Airline> getAirlineByDepCity(String dCity);
	public List<Airline> getAirlineByArrCity(String aCity);
	
	

}
