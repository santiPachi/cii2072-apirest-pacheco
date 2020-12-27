package com.pacheco.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pacheco.backend.models.entities.Rent;

public interface IRent extends CrudRepository<Rent, Long>  {

}
