package com.github.edouardswiac.oanda4j.models;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

public class OrderResponse {
  private CurrencyPair instrument;
  private Date date;
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

  public Date getDate() {
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
}
