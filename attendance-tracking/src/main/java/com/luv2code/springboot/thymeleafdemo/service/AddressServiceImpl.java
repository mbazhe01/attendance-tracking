package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.thymeleafdemo.dao.AddressDAO;
import com.luv2code.springboot.thymeleafdemo.dao.DepartmentDAO;
import com.luv2code.springboot.thymeleafdemo.entity.Address;
import com.luv2code.springboot.thymeleafdemo.entity.Location;

@Service
public class AddressServiceImpl implements AddressService {

	// need to inject address dao
	@Autowired
	private AddressDAO addressDAO;
	
	@Autowired
	public AddressServiceImpl(@Qualifier("addressDAOImpl") AddressDAO theAddressDAO) {
		addressDAO = theAddressDAO;
	}
	
	@Override
	@Transactional
	public List<Address> findAll(int employeeId) {
		return addressDAO.getAddresses(employeeId);
	}

	@Override
	@Transactional
	public void save(Address theAddress) {
		addressDAO.saveAddress(theAddress);
		
	}

	@Override
	@Transactional
	public void deleteAddress(int addrId) {
		
		addressDAO.delete(addrId);
		
	}

	@Override
	@Transactional
	public int getEmployeeByAddrId(int addrId) {
		
		return addressDAO.findEmployeeByAddrId(addrId);
	}
	
	

}//eoc
