package com.github.edouardswiac.oanda4j.models;

import java.util.List;

public class Orders {
  private final List<Order> orders;

  public Orders(List<Order> orders) {
    this.orders = orders;
  }

  public List<Order> getOrders() {
    return orders;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Orders{");
    sb.append("orders=").append(orders);
    sb.append('}');
    return sb.toString();
  }
}
