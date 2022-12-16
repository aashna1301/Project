package com.deloitte.model;

public class Services {
	
	private Integer sId;
	private Integer bId;
	private String meal;
	private Integer exBag;
	private String insurance;
	
	
	public Services() {
		super();
		
	}

	public Services(Integer sId, Integer bId, String meal, Integer exBag, String insurance) {
		super();
		this.sId = sId;
		this.bId = bId;
		this.meal = meal;
		this.exBag = exBag;
		this.insurance = insurance;
	}


	public Integer getsId() {
		return sId;
	}


	public void setsId(Integer sId) {
		this.sId = sId;
	}


	public Integer getbId() {
		return bId;
	}


	public void setbId(Integer bId) {
		this.bId = bId;
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

	
	
	

}
