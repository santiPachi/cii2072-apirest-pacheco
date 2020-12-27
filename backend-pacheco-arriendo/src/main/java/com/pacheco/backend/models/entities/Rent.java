package com.pacheco.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Table(name="Rents")
@Entity
public class Rent implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_rent")
	@Basic(optional=false)
	private Long idRent;

	@Column(name="to_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar toDate;
	
	@Column(name="from_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar fromDate;
	

    
    @JoinColumn(name="fk_lessee_rent",referencedColumnName="id_lessee")
    @OneToOne()
	private Lessee lessee;
    
    @JoinColumn(name="fk_lessor_rent",referencedColumnName="id_lessor")
    @OneToOne()
	private Lessor lessor;
	public Rent() {
		super();
			
	}

	public Rent(Long idRent) {
		super();
		this.idRent= idRent;
	}

	

	public Calendar getToDate() {
		return toDate;
	}

	public void setToDate(Calendar toDate) {
		this.toDate = toDate;
	}

	public Calendar getFromDate() {
		return fromDate;
	}

	public void setFromDate(Calendar fromDate) {
		this.fromDate = fromDate;
	}

	

	public Long getIdRent() {
		return idRent;
	}

	public void setIdRent(Long idRent) {
		this.idRent = idRent;
	}

	public Lessor getLessor() {
		return lessor;
	}

	public void setLessor(Lessor lessor) {
		this.lessor = lessor;
	}

	public Lessee getLessee() {
		return lessee;
	}

	public void setLessee(Lessee lessee) {
		this.lessee = lessee;
	}


	
	
	
}
