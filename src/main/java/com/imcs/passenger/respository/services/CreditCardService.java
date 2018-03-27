package com.imcs.passenger.respository.services;

import com.imcs.passenger.respository.entity.CreditCardDetails;

public interface CreditCardService {
	boolean addCreditCardDetails(CreditCardDetails card);

	CreditCardDetails getCreditCardDetails(long cardNumber);

	boolean updateCreditCardDetails(CreditCardDetails card);

	boolean deleteCreditCardsDetails(long cardNumber);
}
