package com.imcs.passenger.respository.services;

import com.imcs.passenger.respository.dao.PassengerDao;
import com.imcs.passenger.respository.dao.PassengerDaoImpl;
import com.imcs.passenger.respository.entity.Passenger;

public class PassengerServiceImpl implements PassengerService {

	PassengerDao passengerDao = new PassengerDaoImpl();

	public boolean addPassenger(Passenger passenger) {
		return passengerDao.addPassenger(passenger);
	}

	public Passenger getPassenger(String id) {
		return passengerDao.getPassenger(id);
	}

	public boolean updatePassenger(Passenger passenger) {
		return passengerDao.updatePassenger(passenger);
	}

	public boolean deletePassenger(String id) {
		return passengerDao.deletePassenger(id);
	}

}
