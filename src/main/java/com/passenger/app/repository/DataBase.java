package com.passenger.app.repository;

import com.passenger.app.model.Passenger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * DataBase is a class that contains a list of passengers.
 */
public class DataBase {
    private List<Passenger> passengers = new ArrayList<>();
}
