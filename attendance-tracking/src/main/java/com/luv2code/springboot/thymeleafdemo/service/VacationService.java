package com.luv2code.springboot.thymeleafdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.thymeleafdemo.dao.VacationRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Vacation;
import com.luv2code.springboot.thymeleafdemo.entity.VacationTL;

@Service
public class VacationService {

	@Autowired
	VacationRepository vacRepo;

	public List<VacationTL> findAllByEmployeeId(int id) {
		List<Vacation> vacations = vacRepo.findAllByEmplId(id);
		List<VacationTL> vacationsTL = new ArrayList<>();

		if (vacations != null) {
			// syncronize carryover fields
			for (Vacation v : vacations) {
				vacationsTL.add(v.toVacationTL());
			}
		}

		return vacationsTL;
	}
}
