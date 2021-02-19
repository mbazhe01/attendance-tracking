package com.luv2code.springboot.thymeleafdemo.entity;

public class CarryOver {
	private int vacYear;
	private int vacDaysAllowed;
	private Double vacDaysTaken;
	private Double carryOverDays;
	private int carryOverExpired;

	public CarryOver(int vacYear, int vacDaysAllowed, Double vacDaysTaken, Double carryOverDays) {

		this.vacYear = vacYear;
		this.vacDaysAllowed = vacDaysAllowed;
		this.vacDaysTaken = vacDaysTaken;
		this.carryOverDays = carryOverDays;
	}

	public CarryOver() {

	}

	public CarryOver(int vacYear, int vacDaysAllowed, Double vacDaysTaken, Double carryOverDays, int carryOverExpired) {
		super();
		this.vacYear = vacYear;
		this.vacDaysAllowed = vacDaysAllowed;
		this.vacDaysTaken = vacDaysTaken;
		this.carryOverDays = carryOverDays;
		this.carryOverExpired = carryOverExpired;
	}

	public int getCarryOverExpired() {
		return carryOverExpired;
	}

	public void setCarryOverExpired(int carryOverExpired) {
		this.carryOverExpired = carryOverExpired;
	}

	public int getVacYear() {
		return vacYear;
	}

	public void setVacYear(int vacYear) {
		this.vacYear = vacYear;
	}

	public int getVacDaysAllowed() {
		return vacDaysAllowed;
	}

	public void setVacDaysAllowed(int vacDaysAllowed) {
		this.vacDaysAllowed = vacDaysAllowed;
	}

	public Double getVacDaysTaken() {
		return vacDaysTaken;
	}

	public void setVacDaysTaken(Double vacDaysTaken) {
		this.vacDaysTaken = vacDaysTaken;
	}

	public Double getCarryOverDays() {
		return carryOverDays;
	}

	public void setCarryOverDays(Double carryOverDays) {
		this.carryOverDays = carryOverDays;
	}

	public void setZeroCarryOverDaysToNull() {
		if (this.carryOverDays == 0)
			this.carryOverDays = null;
	}

}
