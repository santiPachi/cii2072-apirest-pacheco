package com.pacheco.backend.models.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public class Person {
	@Column(name="name")
	private String name;
	@Column(name="last_name")
	private String lastName;
	@Column(name="birth")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar birth;
	@Column(name="place_of_birth")
	private String placeOfBirth;
	@Column(name="number_card_id")
	private String numberCardId;
	
	public Person() {
		
	}
	
	public Person(String numberCardId) {
		super();
		this.numberCardId = numberCardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getNumberCardId() {
		return numberCardId;
	}
	public void setNumberCardId(String numberCardId) {
		this.numberCardId = numberCardId;
	}
	

}
