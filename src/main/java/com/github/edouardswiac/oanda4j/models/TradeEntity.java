package com.github.edouardswiac.oanda4j.models;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;
import com.github.edouardswiac.oanda4j.enums.OrderType;
import com.github.edouardswiac.oanda4j.enums.TradeSide;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public final class TradeEntity {

  private String id;

  private CurrencyPair instrument;
  private Integer units;
  private TradeSide side;
  // should be type but name can conflict with other JVM languages
  private OrderType orderType;

  private Instant time;
  private Instant expiry;

  private BigDecimal price;
  private BigDecimal takeProfit;
  private BigDecimal profit;
  private BigDecimal stopLoss;
  private BigDecimal upperBound;
  private BigDecimal lowerBound;
  private BigDecimal trailingStop;

  protected TradeEntity(
          String id,
          CurrencyPair instrument,
          Integer units,
          TradeSide side,
          OrderType orderType,
          Instant time,
          BigDecimal price,
          BigDecimal takeProfit,
          BigDecimal profit,
          BigDecimal stopLoss,
          Instant expiry,
          BigDecimal upperBound,
          BigDecimal lowerBound,
          BigDecimal trailingStop) {
    this.id = id;
    this.instrument = instrument;
    this.units = units;
    this.side = side;
    this.orderType = orderType;
    this.time = time;
    this.price = price;
    this.takeProfit = takeProfit;
    this.profit = profit;
    this.stopLoss = stopLoss;
    this.expiry = expiry;
    this.upperBound = upperBound;
    this.lowerBound = lowerBound;
    this.trailingStop = trailingStop;
  }

  public String getId() {
    return id;
  }

  public CurrencyPair getInstrument() {
    return instrument;
  }

  public Integer getUnits() {
    return units;
  }

  public TradeSide getSide() {
    return side;
  }

  public OrderType getOrderType() {
    return orderType;
  }

  public Instant getTime() {
    return time;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getTakeProfit() {
    return takeProfit;
  }

  public BigDecimal getProfit() {
    return profit;
  }

  public BigDecimal getStopLoss() {
    return stopLoss;
  }

  public Instant getExpiry() {
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

  public Map<String, String> asFieldMap() {
    Map<String, String> fields = new HashMap<String, String>();
    if (null != id)           fields.put("id", id);
    if (null != instrument)   fields.put("instrument", instrument.name());
    if (null != units)        fields.put("units", units.toString());
    if (null != side)         fields.put("side", side.name().toLowerCase());
    if (null != orderType)    fields.put("type", orderType.name().toLowerCase());
    if (null != time )        fields.put("time", time.toString());
    if (null != price)        fields.put("price", price.toString());
    if (null != takeProfit)   fields.put("takeProfit", takeProfit.toString());
    if (null != profit)       fields.put("profit", profit.toString());
    if (null != stopLoss)     fields.put("stopLoss", stopLoss.toString());
    if (null != expiry)       fields.put("expiry", expiry.toString());
    if (null != upperBound)   fields.put("upperBound", upperBound.toString());
    if (null != lowerBound)   fields.put("lowerBound", lowerBound.toString());
    if (null != trailingStop) fields.put("trailingStop", trailingStop.toString());
    return fields;
  }

  public static class Builder {
    private String id;
    private CurrencyPair instrument;
    private Integer units;
    private TradeSide side;
    private OrderType orderType;
    private Instant time;
    private BigDecimal price;
    private BigDecimal takeProfit;
    private BigDecimal profit;
    private BigDecimal stopLoss;
    private Instant expiry;
    private BigDecimal upperBound;
    private BigDecimal lowerBound;
    private BigDecimal trailingStop;

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public Builder setInstrument(CurrencyPair instrument) {
      this.instrument = instrument;
      return this;
    }

    public Builder setUnits(Integer units) {
      this.units = units;
      return this;
    }

    public Builder setSide(TradeSide side) {
      this.side = side;
      return this;
    }

    public Builder setOrderType(OrderType orderType) {
      this.orderType = orderType;
      return this;
    }

    public Builder setTime(Instant time) {
      this.time = time;
      return this;
    }

    public Builder setPrice(BigDecimal price) {
      this.price = price;
      return this;
    }

    public Builder setTakeProfit(BigDecimal takeProfit) {
      this.takeProfit = takeProfit;
      return this;
    }

    public Builder setProfit(BigDecimal profit) {
      this.profit = profit;
      return this;
    }

    public Builder setStopLoss(BigDecimal stopLoss) {
      this.stopLoss = stopLoss;
      return this;
    }

    public Builder setExpiry(Instant expiry) {
      this.expiry = expiry;
      return this;
    }

    public Builder setUpperBound(BigDecimal upperBound) {
      this.upperBound = upperBound;
      return this;
    }

    public Builder setLowerBound(BigDecimal lowerBound) {
      this.lowerBound = lowerBound;
      return this;
    }

    public Builder setTrailingStop(BigDecimal trailingStop) {
      this.trailingStop = trailingStop;
      return this;
    }

    public TradeEntity build() {
      return new TradeEntity(
              id,
              instrument,
              units,
              side,
              orderType,
              time,
              price,
              takeProfit,
              profit,
              stopLoss,
              expiry,
              upperBound,
              lowerBound,
              trailingStop
      );
    }
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("TradeEntity{");
    sb.append("id=").append(id);
    sb.append(", instrument='").append(instrument).append('\'');
    sb.append(", units=").append(units);
    sb.append(", side='").append(side).append('\'');
    sb.append(", orderType='").append(orderType).append('\'');
    sb.append(", time=").append(time);
    sb.append(", price=").append(price);
    sb.append(", takeProfit=").append(takeProfit);
    sb.append(", profit=").append(profit);
    sb.append(", stopLoss=").append(stopLoss);
    sb.append(", expiry=").append(expiry);
    sb.append(", upperBound=").append(upperBound);
    sb.append(", lowerBound=").append(lowerBound);
    sb.append(", trailingStop=").append(trailingStop);
    sb.append('}');
    return sb.toString();
  }
}
