package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Services;



public interface ServicesService {

	public List<Services> getAllServices();
	public Services getService(Integer id);
	
	
	
}
