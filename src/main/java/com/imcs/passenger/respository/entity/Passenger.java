package com.imcs.passenger.respository.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "passenger_profile")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "profile_id")
	private Long profileId;

	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String address;

	@Column(name = "tel_no")
	private String telNumber;

	@Column(name = "email_id")
	private String emailId;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "passenger", cascade = CascadeType.ALL)
	private Set<CreditCardDetails> creditCardDetails = new HashSet<CreditCardDetails>();

	public Passenger(String password, String firstName, String lastName, String address, String telNumber,
			String emailId) {
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.telNumber = telNumber;
		this.emailId = emailId;
	}

	public Passenger() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getProfileId() {
		return profileId;
	}

}
