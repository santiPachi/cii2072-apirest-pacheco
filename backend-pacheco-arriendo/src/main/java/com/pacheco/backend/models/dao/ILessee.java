package com.pacheco.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pacheco.backend.models.entities.Lessee;

public interface ILessee extends CrudRepository<Lessee, Long>  {
	@Query("SELECT st FROM Lessee st WHERE st.lastName = :criteria")
	public Lessee buscarPorApellido(String criteria);
	
	public Lessee findByPlaceOfBirth(String place);
			
	
		

}
