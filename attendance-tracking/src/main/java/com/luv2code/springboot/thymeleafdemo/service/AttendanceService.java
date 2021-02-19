package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.AttendanceMonthly;
import com.luv2code.springboot.thymeleafdemo.entity.CarryOver;
import com.luv2code.springboot.thymeleafdemo.entity.LocationMonthly;
import com.luv2code.springboot.thymeleafdemo.entity.VacationTotals;

public interface AttendanceService {
	
	public List<Integer> getAttendanceYears();
	
	public VacationTotals getVacationTotals(Integer year, Integer employeeId);
	
	public List<AttendanceMonthly> getAttendanceMonthly(Integer year, Integer employeeId);
	
	public List<CarryOver> getVacationCarryOverDays(Integer year, Integer emplId);
	
	public Double getTotalCarryOverDays(List<CarryOver> carryOvers);
	
	public List<LocationMonthly> getLocationMonthly(Integer year, Integer employeeId);
}
