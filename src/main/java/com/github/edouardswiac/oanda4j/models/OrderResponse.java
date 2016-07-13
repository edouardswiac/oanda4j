package com.github.edouardswiac.oanda4j.models;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Collection;

public class OrderResponse {
  private CurrencyPair instrument;
  private Instant date;
  private BigDecimal price;
  private TradeEntity tradeOpened;
  private TradeEntity orderOpened;
  private Collection<TradeEntity> tradesClosed;
  private TradeEntity tradeReduced;

  protected OrderResponse() {
  }

  public CurrencyPair getInstrument() {
    return instrument;
  }

  public Instant getDate() {
    return date;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public TradeEntity getTradeOpened() {
    return tradeOpened;
  }

  public TradeEntity getTradeReduced() {
    return tradeReduced;
  }

  public Collection<TradeEntity> getTradesClosed() {
    return tradesClosed;
  }

  public TradeEntity getOrderOpened() {
    return orderOpened;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("OrderResponse{");
    sb.append("instrument=").append(instrument);
    sb.append(", date=").append(date);
    sb.append(", price=").append(price);
    sb.append(", tradeOpened=").append(tradeOpened);
    sb.append(", orderOpened=").append(orderOpened);
    sb.append(", tradesClosed=").append(tradesClosed);
    sb.append(", tradeReduced=").append(tradeReduced);
    sb.append('}');
    return sb.toString();
  }
}
