package com.pacheco.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pacheco.backend.models.entities.Property;

public interface IProperty extends CrudRepository<Property, Long>  {

}
