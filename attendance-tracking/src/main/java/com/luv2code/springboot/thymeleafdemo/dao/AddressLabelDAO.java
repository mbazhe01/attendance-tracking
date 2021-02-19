package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.AddressLabel;
import com.luv2code.springboot.thymeleafdemo.entity.Department;

public interface AddressLabelDAO {

	public List<AddressLabel> getAddressLabels();
}
