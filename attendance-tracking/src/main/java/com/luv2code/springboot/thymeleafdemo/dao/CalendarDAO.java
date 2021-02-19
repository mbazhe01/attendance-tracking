package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Day;
import com.luv2code.springboot.thymeleafdemo.entity.Week;

public interface CalendarDAO {
	int getAttendanceIndicator(int year, int month, int dayOfMonth);
	
	String getMonthName(int monthNum);
	
	List<Week> getWeekDays(int year, int month);
}
