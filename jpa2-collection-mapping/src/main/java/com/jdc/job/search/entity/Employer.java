package com.jdc.job.search.entity;

import javax.persistence.Entity;

@Entity
public class Employer extends Member{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String CreditCardNumber;


	public String getCreditCardNumber() {
		return CreditCardNumber;
	}


	public void setCreditCardNumber(String creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}
	
	
	

}
