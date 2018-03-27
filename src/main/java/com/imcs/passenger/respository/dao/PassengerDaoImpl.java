package com.imcs.passenger.respository.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.imcs.passenger.respository.entity.Passenger;
import com.imcs.passenger.respository.utils.HibernateUtils;

public class PassengerDaoImpl implements PassengerDao {

	public boolean addPassenger(Passenger passenger) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(passenger);
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

	public Passenger getPassenger(String id) {
		Session session = getSession();
		Passenger passenger = (Passenger) session.get(Passenger.class, id);
		session.close();
		return passenger;
	}

	public boolean updatePassenger(Passenger passenger) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(passenger);
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

	public boolean deletePassenger(String id) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			Passenger customer = (Passenger) session.get(Passenger.class, id);
			session.delete(customer);
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
