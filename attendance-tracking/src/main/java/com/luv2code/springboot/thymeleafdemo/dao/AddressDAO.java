package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Address;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.entity.Location;

public interface AddressDAO {

	public List<Address> getAddresses(int theId);
	
	public void saveAddress(Address theAddress);
	
	public void delete(int theId);
	
	public int findEmployeeByAddrId(int addrId);
}
