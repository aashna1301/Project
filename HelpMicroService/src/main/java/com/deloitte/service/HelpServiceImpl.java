package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.entity.Help;
import com.deloitte.repository.HelpRepository;

@Service
public class HelpServiceImpl implements HelpService{
	
	@Autowired
	private HelpRepository helpRepository;

	@Override
	public List<Help> getAllHelp() {
		
		return helpRepository.findAll();
	}

	@Override
	public Help getHelpById(Integer id) {
		// TODO Auto-generated method stub
		return helpRepository.findById(id).get();
	}

	@Override
	public Help getHelpFromFlight() {
		// TODO Auto-generated method stub
		return null;
	}

}
	