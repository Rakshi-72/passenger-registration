package com.passenger.app.controller;

import com.passenger.app.model.Passenger;
import com.passenger.app.repository.DataBase;
import com.passenger.app.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Scanner;

@Controller
public class PassengerRegistrationController {
    private static final Scanner scan = new Scanner(System.in);

    @Autowired
    private PassengerService passengerService;

    /**
     * It registers a user.
     */
    @GetMapping("/user/register")
    public void registerUser() {
        System.out.println("enter id");
        int passengerId = scan.nextInt();
        scan.nextLine();

        System.out.println("enter name");
        String passengerName = scan.nextLine();

        System.out.println("enter email");
        String passengerEmail = scan.nextLine();

        System.out.println("enter password");
        String password = scan.nextLine();

        System.out.println("enter address");
        String address = scan.nextLine();

        System.out.println("enter contact number");
        String contactNumber = scan.nextLine();

        Passenger passenger = new Passenger(passengerId, passengerName, passengerEmail, password, address,
                contactNumber);

        boolean addPassenger = passengerService.addPassenger(passenger);
        if (addPassenger) System.out.println("user registered successfully");
        else System.out.println("something went wrong");
    }
}
