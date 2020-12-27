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
@Table(name="Lessee")
@Entity
public class Lessee extends Person implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_lessee")
	@Basic(optional=false)
	private Long idLessee;
	@Column(name="address")
	private String address;
	
	@Column(name="start_from")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar startFrom;
	//mappedby nombre de la otra clase que represente la ifnromacion
	@OneToMany(mappedBy="lessee", fetch=FetchType.LAZY)
	private List<Rent> subscriptions;
	public Lessee() {
		super();
			
	}

	

	public Long getIdLessee() {
		return idLessee;
	}



	public void setIdLessee(Long idLessee) {
		this.idLessee = idLessee;
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

	public List<Rent> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Rent> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	
	
}
