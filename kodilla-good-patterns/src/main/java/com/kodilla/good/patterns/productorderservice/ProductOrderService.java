package com.kodilla.good.patterns.productorderservice;

public class ProductOrderService {
    private PaymentService paymentService;
    private CommunicationService communicationService;
    private OrderHistory orderHistory;

    public ProductOrderService(PaymentService paymentService, CommunicationService communicationService, OrderHistory orderHistory) {
        this.paymentService = paymentService;
        this.communicationService = communicationService;
        this.orderHistory = orderHistory;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public CommunicationService getCommunicationService() {
        return communicationService;
    }

    public void setCommunicationService(CommunicationService communicationService) {
        this.communicationService = communicationService;
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(OrderHistory orderHistory) {
        this.orderHistory = orderHistory;
    }
    public boolean executeOrder (OrderRequest orderRequest) {
        if (orderRequest.getQuantity() > 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean executePayment (OrderRequest orderRequest) {
        paymentService.receivePayment((double) orderRequest.getQuantity() * orderRequest.getItemPrice());
        return true;
    }


}
