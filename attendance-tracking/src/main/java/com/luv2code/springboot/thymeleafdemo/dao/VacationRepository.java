package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Vacation;

public interface VacationRepository extends JpaRepository<Vacation, Integer> {

	List<Vacation> findAllByEmplId(int id);

}
