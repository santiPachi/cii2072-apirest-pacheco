package com.pacheco.backend.services.interfaces;

import java.util.List;

import com.pacheco.backend.models.entities.Rent;

public interface IRentService {
	public void save(Rent Rent);
	public Rent findById(Long id);
	public void delete(Long id);
	public List<Rent> findAll();
}
