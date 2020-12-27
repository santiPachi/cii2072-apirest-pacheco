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
import javax.persistence.Table;
@Table(name="Subscriptions")
@Entity
public class Subscription implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_subscription")
	@Basic(optional=false)
	private Long idSubscription;

	@Column(name="to_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar toDate;
	
	@Column(name="from_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar fromDate;
	
	@Column(name="grade")
	private String grade;
	
    
    @JoinColumn(name="fk_lessee_subscrip",referencedColumnName="id_lessee")
    @ManyToOne()
	private Lessee lessee;
	public Subscription() {
		super();
			
	}

	public Subscription(Long idSubscription) {
		super();
		this.idSubscription = idSubscription;
	}

	public Long getIdSubscription() {
		return idSubscription;
	}

	public void setIdSubscription(Long idSubscription) {
		this.idSubscription = idSubscription;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Lessee getLessee() {
		return lessee;
	}

	public void setLessee(Lessee lessee) {
		this.lessee = lessee;
	}


	
	
	
}
