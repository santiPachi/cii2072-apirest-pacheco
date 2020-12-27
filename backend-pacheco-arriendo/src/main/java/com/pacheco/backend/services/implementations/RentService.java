package com.pacheco.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacheco.backend.models.dao.IRent;

import com.pacheco.backend.models.entities.Rent;
import com.pacheco.backend.models.entities.Rent;
import com.pacheco.backend.services.interfaces.IRentService;
@Service
public class RentService implements IRentService{

	@Autowired
	private IRent dao;
	@Override
	public void save(Rent c) {
		dao.save(c);
		
	}

	@Override
	public Rent findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Rent c = this.findById(id);
		dao.delete(c);
		
	}

	@Override
	public List<Rent> findAll() {
		return (List<Rent>) dao.findAll();
	}

	

	
	
}
