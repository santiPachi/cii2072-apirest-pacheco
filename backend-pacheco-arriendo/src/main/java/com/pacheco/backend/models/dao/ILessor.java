package com.pacheco.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pacheco.backend.models.entities.Lessor;

public interface ILessor extends CrudRepository<Lessor, Long>  {

}
