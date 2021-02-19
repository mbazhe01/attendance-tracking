package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.AttendanceCode;


public interface AttendanceCodeDAO {

	public List<AttendanceCode> getAttendanceCodes();

	public void saveAttendanceCode(AttendanceCode theAttendanceCode);

	public AttendanceCode getAttendanceCode(int theId);

	public void deleteAttendanceCode(int theId);
}
