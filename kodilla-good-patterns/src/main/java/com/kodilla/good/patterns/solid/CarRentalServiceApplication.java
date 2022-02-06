package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class CarRentalServiceApplication {
    public static void main(String[] args) {
        User user = new User("John", "Wekl");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        CarRentalService carRentalService = new CarRentalService();
        boolean isRented = carRentalService.rent(user, rentFrom, rentTo);

        if (isRented) {

        } else {

        }
    }

}
