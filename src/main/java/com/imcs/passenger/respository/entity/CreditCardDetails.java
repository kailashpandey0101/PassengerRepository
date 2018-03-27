package com.imcs.passenger.respository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "credit_card_details")
public class CreditCardDetails {

	@Id
	@Column(name = "card_number")
	private long cardNumber;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "profile_id", nullable = false)
	private Passenger passenger;

	@Column(name = "card_type")
	private String cardType;

	@Column(name = "expiration_month")
	private String expMonth;

	@Column(name = "expiration_year")
	private int expYear;

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	@Override
	public String toString() {
		return "CreditCardDetails [cardNumber=" + cardNumber + ", passenger=" + passenger + ", cardType=" + cardType
				+ ", expMonth=" + expMonth + ", expYear=" + expYear + "]";
	}

}
