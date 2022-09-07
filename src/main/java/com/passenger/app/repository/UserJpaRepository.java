package com.passenger.app.repository;

import com.passenger.app.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<Passenger, Integer> {

}

