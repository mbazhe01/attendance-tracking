package com.luv2code.springboot.thymeleafdemo.entity;

import java.util.List;

public class CarryOverWrapper {

	List<CarryOver> records;

	public CarryOverWrapper(List<CarryOver> carryoverdays) {
		
		this.records = carryoverdays;
	}

	public List<CarryOver> getRecords() {
		return records;
	}

	public void setRecords(List<CarryOver> records) {
		this.records = records;
	}

	
	
}
