package com.cg.iba.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountId;
	private double InterestRate;
	private double balance;
	private LocalDate dateOfOpening;
	
	//using many to many mapping
	@ManyToMany(mappedBy="accounts")
	private Set<Customer> customers=new HashSet<>();
	
	//default constructor
	public Account() {
		super();
	}
    
	//parameterized constructor
	public Account(long accountId, double interestRate, double balance, LocalDate dateOfOpening) {
        super();
        this.accountId = accountId;
        InterestRate = interestRate;
        this.balance = balance;
        this.dateOfOpening = dateOfOpening;
    }

    public Account(long accountId, double interestRate, double balance, LocalDate dateOfOpening,Set<Customer> customers) {
		super();
		this.accountId = accountId;
		InterestRate = interestRate;
		this.balance = balance;
		this.dateOfOpening = dateOfOpening;
		this.customers = customers;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public Set<Customer> getCustomers(){
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	

}
