package com.github.edouardswiac.oanda4j.models;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Collection;

public final class OrderResponse {
  private final CurrencyPair instrument;
  private final Instant date;
  private final BigDecimal price;
  private final TradeEntity tradeOpened;
  private final TradeEntity orderOpened;
  private final Collection<TradeEntity> tradesClosed;
  private final TradeEntity tradeReduced;

  public OrderResponse(CurrencyPair instrument, Instant date, BigDecimal price, TradeEntity tradeOpened, TradeEntity orderOpened, Collection<TradeEntity> tradesClosed, TradeEntity tradeReduced) {
    this.instrument = instrument;
    this.date = date;
    this.price = price;
    this.tradeOpened = tradeOpened;
    this.orderOpened = orderOpened;
    this.tradesClosed = tradesClosed;
    this.tradeReduced = tradeReduced;
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
