package com.pacheco.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacheco.backend.models.dao.ILessor;

import com.pacheco.backend.models.entities.Lessor;
import com.pacheco.backend.services.interfaces.ILessorService;
@Service
public class LessorService implements ILessorService{

	@Autowired
	private ILessor dao;
	@Override
	public void save(Lessor c) {
		dao.save(c);
		
	}

	@Override
	public Lessor findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Lessor c = this.findById(id);
		dao.delete(c);
		
	}

	@Override
	public List<Lessor> findAll() {
		return (List<Lessor>) dao.findAll();
	}
	
}
