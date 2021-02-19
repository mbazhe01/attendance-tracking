package com.luv2code.springboot.thymeleafdemo.service;

import java.util.Date;
import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;



public interface EmployeeService {

	public List<Employee> findAll();
	
	public List<Employee> findAllWithAttendance(Date date);
	
	public List<Employee> findAllActive();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
