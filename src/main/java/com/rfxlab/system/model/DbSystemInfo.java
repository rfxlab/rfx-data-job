package com.rfxlab.system.model;

import com.google.gson.Gson;

public class DbSystemInfo {
	
	String currentDate;
	
	

	public DbSystemInfo(String currentDate) {
		super();
		this.currentDate = currentDate;
	}
	
	public DbSystemInfo() {
		// TODO Auto-generated constructor stub
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	@Override
	public String toString() {		
		return new Gson().toJson(this);
	}
		
}
