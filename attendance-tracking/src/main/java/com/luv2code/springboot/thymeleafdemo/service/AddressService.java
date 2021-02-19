package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Address;
import com.luv2code.springboot.thymeleafdemo.entity.Department;
import com.luv2code.springboot.thymeleafdemo.entity.Location;

public interface AddressService {
	
	// find all addresses for an employee
	public List<Address> findAll(int employeeId);
	
	// save changes made to address
	public void save(Address theAddress);
	
	// delete an address
	public void deleteAddress(int addrId);
	
	// get employee by address id
	public int getEmployeeByAddrId (int addrId);

}
