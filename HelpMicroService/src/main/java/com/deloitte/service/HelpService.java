package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Help;

public interface HelpService {

	public List<Help> getAllHelp();
	public Help getHelpById(Integer id);
	public Help getHelpFromFlight();
}
