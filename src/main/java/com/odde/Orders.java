package com.odde;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    private int getOrdersCount() {
        return orders.size();
    }

    private Order getOrder(int i) {
        return orders.get(i);
    }

    String asJson() {
        StringBuilder sb = new StringBuilder("{\"orders\": [");

        for (int i = 0; i < getOrdersCount(); i++) {
            Order order = getOrder(i);
            sb.append(order.asJson());
        }

        if (getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}
