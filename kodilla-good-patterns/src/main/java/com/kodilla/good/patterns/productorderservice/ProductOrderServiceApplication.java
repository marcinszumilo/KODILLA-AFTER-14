package com.kodilla.good.patterns.productorderservice;

public class ProductOrderServiceApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService orderProcessor = new ProductOrderService(
                new PaymentService(), new CommunicationService(), new OrderHistory());
        boolean result = orderProcessor.executeOrder(orderRequest);
        if (result) {
            orderProcessor.executePayment(orderRequest);
        }
    }
}
