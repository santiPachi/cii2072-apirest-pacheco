package com.pacheco.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Properties")
@Entity
public class Property implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_property")
	@Basic(optional=false)
	private Long idProperty;
	@Column(name="name")
	private String name;
	@Column(name="main_street")
	private String mainStreet;
	@Column(name="secundary_street")
	private String secundaryStreet;
	@Column(name="price")
	private float price;
	@Column(name="num_rooms")
	private float numRomms;
	@Column(name="num_bethrooms")
	private float numBethrooms;
	@Column(name="num_garages")
	private float numGarages;
	@Column(name="description")
	private String description;

	
	
	public Property() {
		super();
		
		
	}
	
	
	public Property(Long idProperty) {
		super();
		this.idProperty = idProperty;
	}


	public Long getIdProperty() {
		return idProperty;
	}


	public void setIdProperty(Long idProperty) {
		this.idProperty = idProperty;
	}


	public String getMainStreet() {
		return mainStreet;
	}


	public void setMainStreet(String mainStreet) {
		this.mainStreet = mainStreet;
	}


	public String getSecundaryStreet() {
		return secundaryStreet;
	}


	public void setSecundaryStreet(String secundaryStreet) {
		this.secundaryStreet = secundaryStreet;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public float getNumRomms() {
		return numRomms;
	}


	public void setNumRomms(float numRomms) {
		this.numRomms = numRomms;
	}


	public float getNumBethrooms() {
		return numBethrooms;
	}


	public void setNumBethrooms(float numBethrooms) {
		this.numBethrooms = numBethrooms;
	}


	public float getNumGarages() {
		return numGarages;
	}


	public void setNumGarages(float numGarages) {
		this.numGarages = numGarages;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
