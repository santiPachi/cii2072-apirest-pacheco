package com.pacheco.backend.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pacheco.backend.models.entities.Lessee;
import com.pacheco.backend.models.entities.Lessor;

public interface ILessor extends CrudRepository<Lessor, Long>  {
	@Query("SELECT st FROM Lessor st WHERE st.lastName = :criteria")
	public Lessor buscarPorApellido(String criteria);
	
	public Lessor findByPlaceOfBirth(String place);
			
}
