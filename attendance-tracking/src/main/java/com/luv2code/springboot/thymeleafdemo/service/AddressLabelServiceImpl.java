package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.thymeleafdemo.dao.AddressLabelDAO;
import com.luv2code.springboot.thymeleafdemo.dao.DepartmentDAO;
import com.luv2code.springboot.thymeleafdemo.entity.Address;
import com.luv2code.springboot.thymeleafdemo.entity.AddressLabel;

@Service
public class AddressLabelServiceImpl implements AddressLabelService {

	// need to inject location dao
	@Autowired
	private AddressLabelDAO addressLabelDAO;
				
	@Autowired
	public AddressLabelServiceImpl(@Qualifier("addressLabelDAOImpl") AddressLabelDAO theAddressLabelDAO) {
		addressLabelDAO = theAddressLabelDAO;
	}
	
	
	@Override
	@Transactional
	public List<AddressLabel> findAll() {
		return addressLabelDAO.getAddressLabels();
	}

}
