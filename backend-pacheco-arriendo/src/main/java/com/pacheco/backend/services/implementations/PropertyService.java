package com.pacheco.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacheco.backend.models.dao.IProperty;

import com.pacheco.backend.models.entities.Property;
import com.pacheco.backend.models.entities.Property;
import com.pacheco.backend.services.interfaces.IPropertyService;
@Service
public class PropertyService implements IPropertyService{

	@Autowired
	private IProperty dao;
	@Override
	public void save(Property c) {
		dao.save(c);
		
	}

	@Override
	public Property findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Property c = this.findById(id);
		dao.delete(c);
		
	}

	@Override
	public List<Property> findAll() {
		return (List<Property>) dao.findAll();
	}

	

	
	
}
