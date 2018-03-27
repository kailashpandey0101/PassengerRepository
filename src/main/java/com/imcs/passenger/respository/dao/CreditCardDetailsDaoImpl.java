package com.imcs.passenger.respository.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.imcs.passenger.respository.entity.CreditCardDetails;
import com.imcs.passenger.respository.utils.HibernateUtils;

public class CreditCardDetailsDaoImpl implements CreditCardDetailsDao {

	public boolean addCreditCardDetails(CreditCardDetails card) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(card);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return false;
	}

	public CreditCardDetails getCreditCardDetails(long cardNumber) {
		Session session = getSession();
		CreditCardDetails card = (CreditCardDetails) session.get(CreditCardDetails.class, cardNumber);
		session.close();
		return card;
	}

	public boolean updateCreditCardDetails(CreditCardDetails card) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(card);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return false;
	}

	public boolean deleteCreditCardsDetails(long cardNumber) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			CreditCardDetails card = (CreditCardDetails) session.get(CreditCardDetails.class, cardNumber);
			session.delete(card);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return false;
	}

	private Session getSession() {
		return HibernateUtils.getSessionFactory().openSession();
	}

}
