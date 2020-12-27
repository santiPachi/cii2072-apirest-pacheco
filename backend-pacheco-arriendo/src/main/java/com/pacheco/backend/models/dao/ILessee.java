package com.pacheco.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pacheco.backend.models.entities.Lessee;

public interface ILessee extends CrudRepository<Lessee, Long>  {

}
