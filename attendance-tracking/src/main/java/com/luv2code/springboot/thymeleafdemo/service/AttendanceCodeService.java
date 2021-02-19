package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.AttendanceCode;
import com.luv2code.springboot.thymeleafdemo.entity.Department;

public interface AttendanceCodeService {
	public List<AttendanceCode> findAll();
	
	public AttendanceCode findById(int theId);
	
	public void save(AttendanceCode theAttendanceCode);
	
	public void deleteById(int theId);
}
