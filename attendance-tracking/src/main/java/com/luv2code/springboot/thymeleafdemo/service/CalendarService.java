package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Week;

public interface CalendarService {
	public Boolean hasAttendance(int year, int month, int day );
	public String getMonthName(int monthNum);
	public List<Week> getWeeks(int year, int month);
	
}
