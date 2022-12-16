package com.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.deloitte.entity.Services;
import com.deloitte.repository.ServicesRepository;

@Service
public class ServicesServiceImpl implements ServicesService {
	
	private ServicesRepository servicesRepository;	

	@Override
	public List<Services> getAllServices() {
		// TODO Auto-generated method stub
		return servicesRepository.findAll(); 
	}

	@Override
	public Services getService(Integer id) {
		// TODO Auto-generated method stub
		return servicesRepository.findById(id).get();
	}
	

}
