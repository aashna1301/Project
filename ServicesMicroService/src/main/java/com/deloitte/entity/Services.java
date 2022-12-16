package com.deloitte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Services {
	
	@Id
	private Integer sId;
	private String meal;
	private Integer exBag;
	private String insurance;
	private Integer bId;
	
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(Integer sId, String meal, Integer exBag, String insurance, Integer bId) {
		super();
		this.sId = sId;
		this.meal = meal;
		this.exBag = exBag;
		this.insurance = insurance;
		this.bId = bId;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public Integer getExBag() {
		return exBag;
	}

	public void setExBag(Integer exBag) {
		this.exBag = exBag;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}
	
	

}
