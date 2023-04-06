package com.yedam.departments;

public class DptDTO {

	/*
	DEPARTMENT_ID   NOT NULL NUMBER(4)    
	DEPARTMENT_NAME NOT NULL VARCHAR2(30) 
	MANAGER_ID               NUMBER(6)    
	LOCATION_ID              NUMBER(4)  
	*/
	
	private int dptId;
	private String dptName;
	private String manager;
	private String location;
	
	
	
	
	
	
	public int getDptId() {
		return dptId;
	}
	public void setDptId(int dptId) {
		this.dptId = dptId;
	}
	public String getDptName() {
		return dptName;
	}
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


