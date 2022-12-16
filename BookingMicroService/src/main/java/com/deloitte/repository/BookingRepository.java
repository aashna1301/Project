package com.deloitte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{
	
	Booking findByTName(String tname);
	

}
