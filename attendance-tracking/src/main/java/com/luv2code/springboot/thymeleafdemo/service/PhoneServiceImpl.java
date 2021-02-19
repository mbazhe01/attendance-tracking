package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.thymeleafdemo.dao.AddressDAO;
import com.luv2code.springboot.thymeleafdemo.dao.PhoneDAO;
import com.luv2code.springboot.thymeleafdemo.entity.Phone;

@Service
public class PhoneServiceImpl implements PhoneService {

	// need to inject phone dao
	@Autowired
	private PhoneDAO phoneDAO;
	
	@Autowired
	public PhoneServiceImpl(@Qualifier("phoneDAOImpl") PhoneDAO thePhoneDAO) {
		phoneDAO = thePhoneDAO;
	}
	
	
	@Override
	@Transactional
	public List<Phone> findAll(int employeeId) {
		return phoneDAO.getPhones(employeeId);
	}

	@Override
	@Transactional
	public void save(Phone thePhone) {
		phoneDAO.save(thePhone);

	}

	@Override
	@Transactional
	public void deletePhone(int phoneId) {
		phoneDAO.delete(phoneId);

	}

	@Override
	@Transactional
	public int getEmployeeByPhoneId(int phoneId) {
		// TODO Auto-generated method stub
		return phoneDAO.findEmployeeByPhoneId(phoneId);
	}

}
