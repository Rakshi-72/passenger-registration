package com.passenger.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
public class Passenger {
    @Id
    private int passengerId;
    private String passengerName;
    private String passengerEmail;
    private String password;
    private String address;
    private String contactNumber;
}