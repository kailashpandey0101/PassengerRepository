package com.imcs.passenger.respository.services;

import com.imcs.passenger.respository.dao.CreditCardDetailsDao;
import com.imcs.passenger.respository.dao.CreditCardDetailsDaoImpl;
import com.imcs.passenger.respository.entity.CreditCardDetails;

public class CreditCardServiceImpl implements CreditCardService {

	CreditCardDetailsDao creditCardDao = new CreditCardDetailsDaoImpl();

	public boolean addCreditCardDetails(CreditCardDetails card) {
		return creditCardDao.addCreditCardDetails(card);
	}

	public CreditCardDetails getCreditCardDetails(long cardNumber) {
		return creditCardDao.getCreditCardDetails(cardNumber);
	}

	public boolean updateCreditCardDetails(CreditCardDetails card) {
		return creditCardDao.updateCreditCardDetails(card);
	}

	public boolean deleteCreditCardsDetails(long cardNumber) {
		return creditCardDao.deleteCreditCardsDetails(cardNumber);
	}

}
