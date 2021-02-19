package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.Date;
import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();
	
	public List<Employee> getEmployeesWithAttendance(Date attendanceDate);
	
	public List<Employee> getActiveEmployees();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
}
