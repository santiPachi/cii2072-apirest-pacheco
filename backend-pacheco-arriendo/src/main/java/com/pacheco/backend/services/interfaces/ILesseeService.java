package com.pacheco.backend.services.interfaces;

import java.util.List;

import com.pacheco.backend.models.entities.Lessee;

public interface ILesseeService {
	public void save(Lessee c);
	public Lessee findById(Long id);
	public void delete(Long id);
	public List<Lessee> findAll();

}
