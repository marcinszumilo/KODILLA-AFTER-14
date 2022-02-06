package com.kodilla.good.patterns.productorderservice;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("John", "Wekl");
        LocalDateTime orderTime = LocalDateTime.of(2017, 8, 1, 12, 0);
        String item = "książka";
        int quantity = 5;
        double itemPrice = 3.14;

        return new OrderRequest(user, orderTime, item, quantity);
    }

}
