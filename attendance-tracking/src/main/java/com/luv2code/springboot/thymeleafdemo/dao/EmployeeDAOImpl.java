package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.thymeleafdemo.entity.Address;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	// define field for entity manager	
	private EntityManager entityManager;
	
	// set up constructor injection
	@Autowired
	public EmployeeDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Employee> getEmployees() {
	
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query  ... sort by employee id
		Query<Employee> theQuery = 
						currentSession.createQuery("from Employee",
													Employee.class);
				
		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();
						
		// return the results		
		return employees;
		
	}

	@Override
	public void saveEmployee(Employee theEmployee) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// adjust Date data type
		
		if (theEmployee.getStartDate().equals(""))
			theEmployee.setStartDate(null);
			
		if (theEmployee.getResignDate().equals(""))
			theEmployee.setResignDate(null);
		
		//theEmployee.setStartDate(null);
		//theEmployee.setResignDate(null);
		
		// save/update the employee ... finally LOL
		currentSession.saveOrUpdate(theEmployee);
	}

	@Override
	public Employee getEmployee(int theId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// now retrieve/read from database using the primary key
		Employee theEmployee = currentSession.get(Employee.class, theId);
				
		return theEmployee;
	}

	@Override
	public void deleteEmployee(int theId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		
		// delete object with primary key
		Query theQuery = 
						currentSession.createQuery("delete from Employee where emplId=:employeeId");
				theQuery.setParameter("employeeId", theId);
				
		theQuery.executeUpdate();	

	}

	@Override
	public List<Employee> getEmployeesWithAttendance(Date attendanceDate) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// create a query  ... sort by employee id
		Query<Employee> theQuery = 
						currentSession.createQuery("from Employee e "
								+ " where exists ( from AttendanceRecord r"
								+ " where e.emplId = r.emplId and r.recDate := recdate)",
													Employee.class);
				
		theQuery.setParameter("recDate", attendanceDate);	
				
		// execute query and get result list of
		// employees with the attendance records for the date
		List<Employee> employees = theQuery.getResultList();
								
		// return the results		
		return employees;
	}

	@Override
	public List<Employee> getActiveEmployees() {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
						
		// create a query  ... sort by employee id
		Query<Employee> theQuery = 
					currentSession.createQuery("from Employee e "
						+ " where activeStatus = 1",
						Employee.class);
		// execute query and get result list of
		// employees with the attendance records for the date
		List<Employee> employees = theQuery.getResultList();
										
		// return the results		
		return employees;
	}

}
