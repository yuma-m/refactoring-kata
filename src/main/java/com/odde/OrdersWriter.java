package com.odde;

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        return orders.asJson();
    }

    private String getSizeFor(Product product) {
        return product.getSizeAsString();
    }

    private String getColorFor(Product product) {
        return product.getColorAsString();
    }
}