package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.AttendanceMonthly;
import com.luv2code.springboot.thymeleafdemo.entity.CarryOver;
import com.luv2code.springboot.thymeleafdemo.entity.LocationMonthly;
import com.luv2code.springboot.thymeleafdemo.entity.VacationTotals;

public interface AttendanceDAO {
	public List<Integer> getAttendanceYears();
	
	public VacationTotals getVacationTotals(Integer year, Integer emplId);
	
	public List<AttendanceMonthly> getAttendanceMonthly(Integer year, Integer empId);
	
	public List<CarryOver> getCarryOverDays(Integer year, int emplId);
	
	public List<LocationMonthly> getLocationMonthly(Integer year, Integer empId);
}
