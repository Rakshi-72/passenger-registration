package com.passenger.app.service;

import com.passenger.app.model.Passenger;
import com.passenger.app.repository.DataBase;
import com.passenger.app.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    private DataBase dataBase;

    @Autowired
    private UserJpaRepository repository;

    public boolean addPassenger(Passenger passenger) {
        dataBase.getPassengers().add(passenger);
        List<Passenger> passengers = repository.saveAll(dataBase.getPassengers());
        return !passengers.isEmpty();
    }
}
