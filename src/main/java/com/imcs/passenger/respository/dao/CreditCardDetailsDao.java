package com.imcs.passenger.respository.dao;

import com.imcs.passenger.respository.entity.CreditCardDetails;

public interface CreditCardDetailsDao {
	boolean addCreditCardDetails(CreditCardDetails card);

	CreditCardDetails getCreditCardDetails(long cardNumber);

	boolean updateCreditCardDetails(CreditCardDetails card);

	boolean deleteCreditCardsDetails(long cardNumber);
}
