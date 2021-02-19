package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.thymeleafdemo.dao.AttendanceCodeDAO;
import com.luv2code.springboot.thymeleafdemo.dao.DepartmentDAO;
import com.luv2code.springboot.thymeleafdemo.entity.AttendanceCode;

@Service
public class AttendanceCodeServiceImpl implements AttendanceCodeService {

	// need to inject location dao
	@Autowired
	private AttendanceCodeDAO attendanceCodeDAO;
				
	@Autowired
	public AttendanceCodeServiceImpl(@Qualifier("attendanceCodeDAOImpl") AttendanceCodeDAO theAttendanceCodeDAO) {
		attendanceCodeDAO = theAttendanceCodeDAO;
	}
	
	@Override
	@Transactional
	public List<AttendanceCode> findAll() {
		return attendanceCodeDAO.getAttendanceCodes();
	}

	@Override
	@Transactional
	public AttendanceCode findById(int theId) {
		return attendanceCodeDAO.getAttendanceCode(theId);
	}

	@Override
	@Transactional
	public void save(AttendanceCode theAttendanceCode) {
		attendanceCodeDAO.saveAttendanceCode(theAttendanceCode);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
	
		attendanceCodeDAO.deleteAttendanceCode(theId);
	}

}
