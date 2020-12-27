package com.pacheco.backend.services.interfaces;

import java.util.List;

import com.pacheco.backend.models.entities.Property;

public interface IPropertyService {
	public void save(Property property);
	public Property findById(Long id);
	public void delete(Long id);
	public List<Property> findAll();
}
