package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Phone;

public interface PhoneService {
	// find all addresses for an employee
	public List<Phone> findAll(int employeeId);
		
	// save changes made to phone
	public void save(Phone thePhone);
		
	// delete a phone
	public void deletePhone(int phoneId);
		
	// get employee by phone id
	public int getEmployeeByPhoneId (int phoneId);
}
