package com.imcs.passenger.respository.services;

import com.imcs.passenger.respository.entity.Passenger;

public interface PassengerService {

	boolean addPassenger(Passenger passenger);

	Passenger getPassenger(String id);

	boolean updatePassenger(Passenger passenger);

	boolean deletePassenger(String id);
}
