package com.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.entity.Services;
import com.deloitte.service.ServicesService;

@RestController
@RequestMapping("/services")
public class ServicesController {
	
	@Autowired
	private ServicesService servicesService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getServices")
	public ResponseEntity<List<Services>> getAllServices(){
		List<Services> serviceList = servicesService.getAllServices();
		return new ResponseEntity<List<Services>>(serviceList, HttpStatus.OK);
	}
	
	@GetMapping("getService/{id}")
	public ResponseEntity<Services> getService(@PathVariable("id") Integer id){
		Services service = servicesService.getService(id);
		return new ResponseEntity<Services>(service, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
