package com.deloitte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.entity.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline,Integer> {
	
	List<Airline> findByDepCity(String depCity);
	List<Airline> findByArrCity(String arrCity);

}
