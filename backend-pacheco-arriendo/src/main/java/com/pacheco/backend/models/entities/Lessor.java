package com.pacheco.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table(name="Lessor")
@Entity
public class Lessor extends Person implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_lessor")
	@Basic(optional=false)
	private Long idLessor;
	@Column(name="address")
	private String address;
	
	@Column(name="start_from")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar startFrom;

	public Lessor() {
		super();
			
	}


	public Long getIdLessor() {
		return idLessor;
	}




	public void setIdLessor(Long idLessor) {
		this.idLessor = idLessor;
	}




	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Calendar getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(Calendar startFrom) {
		this.startFrom = startFrom;
	}

	
	
	
	
}
