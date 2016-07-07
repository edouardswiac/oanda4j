package com.github.edouardswiac.oanda4j.models;

import java.math.BigDecimal;
import java.util.Date;

public final class Order {
  private double id;

  // minimum required fields
  private String instrument;
  private int units;
  private String side;
  private String orderType;

  private Date time;
  private BigDecimal price;
  private BigDecimal takeProfit;
  private BigDecimal stopLoss;
  private Date expiry;
  private BigDecimal upperBound;
  private BigDecimal lowerBound;
  private BigDecimal trailingStop;

  // minimal constructor for an order
  public Order(String instrument, String orderType, int units, String side) {
    this.instrument = instrument;
    this.orderType = orderType;
    this.units = units;
    this.side = side;
  }

  public Order(double id, String instrument, int units, String side, String orderType, Date time, BigDecimal price, BigDecimal takeProfit, BigDecimal stopLoss, Date expiry, BigDecimal upperBound, BigDecimal lowerBound, BigDecimal trailingStop) {
    this.id = id;
    this.instrument = instrument;
    this.units = units;
    this.side = side;
    this.orderType = orderType;
    this.time = time;
    this.price = price;
    this.takeProfit = takeProfit;
    this.stopLoss = stopLoss;
    this.expiry = expiry;
    this.upperBound = upperBound;
    this.lowerBound = lowerBound;
    this.trailingStop = trailingStop;
  }

  public double getId() {
    return id;
  }

  public String getInstrument() {
    return instrument;
  }

  public int getUnits() {
    return units;
  }

  public String getSide() {
    return side;
  }

  public String getOrderType() {
    return orderType;
  }

  public Date getTime() {
    return time;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getTakeProfit() {
    return takeProfit;
  }

  public BigDecimal getStopLoss() {
    return stopLoss;
  }

  public Date getExpiry() {
    return expiry;
  }

  public BigDecimal getUpperBound() {
    return upperBound;
  }

  public BigDecimal getLowerBound() {
    return lowerBound;
  }

  public BigDecimal getTrailingStop() {
    return trailingStop;
  }

  public void setInstrument(String instrument) {
    this.instrument = instrument;
  }

  public void setUnits(int units) {
    this.units = units;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public void setExpiry(Date expiry) {
    this.expiry = expiry;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setUpperBound(BigDecimal upperBound) {
    this.upperBound = upperBound;
  }

  public void setLowerBound(BigDecimal lowerBound) {
    this.lowerBound = lowerBound;
  }

  public void setStopLoss(BigDecimal stopLoss) {
    this.stopLoss = stopLoss;
  }

  public void setTakeProfit(BigDecimal takeProfit) {
    this.takeProfit = takeProfit;
  }

  public void setTrailingStop(BigDecimal trailingStop) {
    this.trailingStop = trailingStop;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Order{");
    sb.append("id=").append(id);
    sb.append(", instrument='").append(instrument).append('\'');
    sb.append(", units=").append(units);
    sb.append(", side='").append(side).append('\'');
    sb.append(", orderType='").append(orderType).append('\'');
    sb.append(", time=").append(time);
    sb.append(", price=").append(price);
    sb.append(", takeProfit=").append(takeProfit);
    sb.append(", stopLoss=").append(stopLoss);
    sb.append(", expiry=").append(expiry);
    sb.append(", upperBound=").append(upperBound);
    sb.append(", lowerBound=").append(lowerBound);
    sb.append(", trailingStop=").append(trailingStop);
    sb.append('}');
    return sb.toString();
  }
}