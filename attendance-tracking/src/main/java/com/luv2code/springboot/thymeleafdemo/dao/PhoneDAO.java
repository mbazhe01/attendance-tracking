package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Phone;

public interface PhoneDAO {
	public List<Phone> getPhones(int theId);
	
	public void save(Phone thePhone);
	
	public void delete(int theId);
	
	public int findEmployeeByPhoneId(int phoneId);
}
