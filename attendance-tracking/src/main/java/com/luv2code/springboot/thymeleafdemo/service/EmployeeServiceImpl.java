package com.luv2code.springboot.thymeleafdemo.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.thymeleafdemo.dao.EmployeeDAO;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	// need to inject customer dao
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOImpl") EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.getEmployees();
	}
	
	
	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.saveEmployee(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteEmployee(theId);
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(theId);
	}

	@Override
	public List<Employee> findAllWithAttendance(Date date) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeesWithAttendance(date);
	}

	@Override
	public List<Employee> findAllActive() {
		// TODO Auto-generated method stub
		return employeeDAO.getActiveEmployees();
	}

}






