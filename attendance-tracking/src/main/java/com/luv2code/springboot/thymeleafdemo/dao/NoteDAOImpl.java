package com.luv2code.springboot.thymeleafdemo.dao;

import javax.persistence.EntityManager;

public class NoteDAOImpl extends GenericDAOImpl {

	public NoteDAOImpl(EntityManager theEntityManager) {
		super(theEntityManager);
	}

}
