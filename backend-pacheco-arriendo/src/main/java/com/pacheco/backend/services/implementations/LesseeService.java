package com.pacheco.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacheco.backend.models.dao.ILessee;
import com.pacheco.backend.models.entities.Lessee;
import com.pacheco.backend.services.interfaces.ILesseeService;
@Service
public class LesseeService implements ILesseeService{
	@Autowired
	private ILessee dao;
	@Override
	public void save(Lessee c) {
		dao.save(c);
		
	}

	@Override
	public Lessee findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Lessee c = this.findById(id);
		dao.delete(c);
		
	}

	@Override
	public List<Lessee> findAll() {
		return (List<Lessee>) dao.findAll();
	}
	
	


}
