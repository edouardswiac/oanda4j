package com.github.edouardswiac.oanda4j.models;

import java.util.Collection;

public class OrderList {
  private final Collection<TradeEntity> orders;

  public OrderList(Collection<TradeEntity> orders) {
    this.orders = orders;
  }

  public Collection<TradeEntity> getOrders() {
    return orders;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("OrderList{");
    sb.append("orders=").append(orders);
    sb.append('}');
    return sb.toString();
  }
}
