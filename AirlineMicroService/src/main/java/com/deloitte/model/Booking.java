package com.deloitte.model;

public class Booking {
	
	private Integer bId;
	private String tName;
	private Double bFare;
	private Integer fNo;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(Integer bId, String tName, Double bFare, Integer fNo) {
		super();
		this.bId = bId;
		this.tName = tName;
		this.bFare = bFare;
		this.fNo = fNo;
	}
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public Double getbFare() {
		return bFare;
	}
	public void setbFare(Double bFare) {
		this.bFare = bFare;
	}
	public Integer getfNo() {
		return fNo;
	}
	public void setfNo(Integer fNo) {
		this.fNo = fNo;
	}
	
	

}
