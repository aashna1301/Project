package com.deloitte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Airline {
	
	private String fName;	
	@Id
	@GeneratedValue
	private Integer fNo;	
	private String depCity;
	private String arrCity;
	
	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airline(String fName, Integer fNo, String depCity, String arrCity) {
		super();
		this.fName = fName;
		this.fNo = fNo;
		this.depCity = depCity;
		this.arrCity = arrCity;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Integer getfNo() {
		return fNo;
	}
	public void setfNo(Integer fNo) {
		this.fNo = fNo;
	}
	public String getDepCity() {
		return depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	
	
	

}
