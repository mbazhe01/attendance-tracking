package com.luv2code.springboot.thymeleafdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_attendance_code")
public class AttendanceCode {

	private int attendanceCodeId;
    private String attendanceCode;
    private String description;
    
    public AttendanceCode() { }

	public AttendanceCode(int attendanceCodeId, String attendanceCode, String description) {
		
		this.attendanceCodeId = attendanceCodeId;
		this.attendanceCode = attendanceCode;
		this.description = description;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="attendance_code_id")
	public int getAttendanceCodeId() {
		return attendanceCodeId;
	}

	public void setAttendanceCodeId(int attendanceCodeId) {
		this.attendanceCodeId = attendanceCodeId;
	}

	@Column(name = "attendance_code", nullable = false)
	public String getAttendanceCode() {
		return attendanceCode;
	}

	public void setAttendanceCode(String attendanceCode) {
		this.attendanceCode = attendanceCode;
	}

	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AttendanceCode [attendanceCodeId=" + attendanceCodeId + ", attendanceCode=" + attendanceCode
				+ ", description=" + description + "]";
	}
    
	
    
    
}
