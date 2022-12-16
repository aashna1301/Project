package com.deloitte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Help {
	
	@Id
	private Integer helpId;
	private long ccNo;
	private String ccMail;
	private Integer fNo;
	public Help() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Help(Integer helpId, long ccNo, String ccMail, Integer fNo) {
		super();
		this.helpId = helpId;
		this.ccNo = ccNo;
		this.ccMail = ccMail;
		this.fNo = fNo;
	}
	public Integer getHelpId() {
		return helpId;
	}
	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}
	public long getCcNo() {
		return ccNo;
	}
	public void setCcNo(long ccNo) {
		this.ccNo = ccNo;
	}
	public String getCcMail() {
		return ccMail;
	}
	public void setCcMail(String ccMail) {
		this.ccMail = ccMail;
	}
	public Integer getfNo() {
		return fNo;
	}
	public void setfNo(Integer fNo) {
		this.fNo = fNo;
	}
	
	

}
