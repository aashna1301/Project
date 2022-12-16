package com.deloitte.model;

import com.deloitte.entity.Airline;

public class FailureResponse {
	
	private Airline airlines;
	private String message;
	public FailureResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponse(Airline airlines, String message) {
		super();
		this.airlines = airlines;
		this.message = message;
	}
	public Airline getAirlines() {
		return airlines;
	}
	public void setAirlines(Airline airlines) {
		this.airlines = airlines;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
