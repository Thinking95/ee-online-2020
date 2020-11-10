package com.jdc.job.search.entity;

import javax.persistence.Entity;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.AttributeOverrides;

@Entity
public class Candidate extends Member{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String education;
	
	@AttributeOverrides({
		@AttributeOverride(name = "address", column = @Column(name = "add_address", table = "Candidate")),
		@AttributeOverride(name = "street", column = @Column(name = "add_street", table = "Candidate")),
		@AttributeOverride(name = "township", column = @Column(name = "add_township", table = "Candidate")) 
	})
	private Address address;
	@AttributeOverrides({
		@AttributeOverride(name = "address", column = @Column(name = "con_address", table = "Candidate")),
		@AttributeOverride(name = "street", column = @Column(name = "con_street", table = "Candidate")),
		@AttributeOverride(name = "township", column = @Column(name = "con_township", table = "Candidate")) 
	})
	private Address contact;
	
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getContact() {
		return contact;
	}

	public void setContact(Address contact) {
		this.contact = contact;
	}
	
	
	

}
