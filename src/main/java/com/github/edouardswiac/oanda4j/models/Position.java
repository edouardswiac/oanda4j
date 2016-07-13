package com.github.edouardswiac.oanda4j.models;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;
import com.github.edouardswiac.oanda4j.enums.TradeSide;

import java.math.BigDecimal;

public final class Position {
  private final TradeSide tradeSide;
  private final CurrencyPair currencyPair;
  private final int units;
  private final BigDecimal avgPrice;

  public Position(TradeSide tradeSide, CurrencyPair currencyPair, int units, BigDecimal avgPrice) {
    this.tradeSide = tradeSide;
    this.currencyPair = currencyPair;
    this.units = units;
    this.avgPrice = avgPrice;
  }

  public TradeSide getTradeSide() {
    return tradeSide;
  }

  public CurrencyPair getCurrencyPair() {
    return currencyPair;
  }

  public int getUnits() {
    return units;
  }

  public BigDecimal getAvgPrice() {
    return avgPrice;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Position{");
    sb.append("tradeSide=").append(tradeSide);
    sb.append(", currencyPair=").append(currencyPair);
    sb.append(", units=").append(units);
    sb.append(", avgPrice=").append(avgPrice);
    sb.append('}');
    return sb.toString();
  }
}
