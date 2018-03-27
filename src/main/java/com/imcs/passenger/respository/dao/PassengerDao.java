package com.imcs.passenger.respository.dao;

import com.imcs.passenger.respository.entity.Passenger;

public interface PassengerDao {
	
	boolean addPassenger(Passenger passenger);
	Passenger getPassenger(String id);
	boolean updatePassenger(Passenger passenger);
	boolean deletePassenger(String id);
}
