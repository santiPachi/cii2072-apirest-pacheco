package com.pacheco.backend.services.interfaces;

import java.util.List;

import com.pacheco.backend.models.entities.Lessor;

public interface ILessorService {
	public void save(Lessor c);
	public Lessor findById(Long id);
	public void delete(Long id);
	public List<Lessor> findAll();

}
