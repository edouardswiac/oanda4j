package com.github.edouardswiac.oanda4j.models;

import java.math.BigDecimal;
import java.time.Instant;

public class BidAskCandle implements Candle {
  private final Instant time;
  private final BigDecimal openBid;
  private final BigDecimal openAsk;
  private final BigDecimal highBid;
  private final BigDecimal highAsk;
  private final BigDecimal lowBid;
  private final BigDecimal lowAsk;
  private final BigDecimal closeBid;
  private final BigDecimal closeAsk;
  private final long volume;
  private final boolean complete;

  public BidAskCandle(Instant time, BigDecimal openBid, BigDecimal openAsk, BigDecimal highBid, BigDecimal highAsk, BigDecimal lowBid, BigDecimal lowAsk, BigDecimal closeBid, BigDecimal closeAsk, long volume, boolean complete) {
    this.time = time;
    this.openBid = openBid;
    this.openAsk = openAsk;
    this.highBid = highBid;
    this.highAsk = highAsk;
    this.lowBid = lowBid;
    this.lowAsk = lowAsk;
    this.closeBid = closeBid;
    this.closeAsk = closeAsk;
    this.volume = volume;
    this.complete = complete;
  }

  public Instant getTime() {
    return time;
  }

  public BigDecimal getOpenBid() {
    return openBid;
  }

  public BigDecimal getOpenAsk() {
    return openAsk;
  }

  public BigDecimal getHighBid() {
    return highBid;
  }

  public BigDecimal getHighAsk() {
    return highAsk;
  }

  public BigDecimal getLowBid() {
    return lowBid;
  }

  public BigDecimal getLowAsk() {
    return lowAsk;
  }

  public BigDecimal getCloseBid() {
    return closeBid;
  }

  public BigDecimal getCloseAsk() {
    return closeAsk;
  }

  public long getVolume() {
    return volume;
  }

  public boolean isComplete() {
    return complete;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("BidAskCandle{");
    sb.append("time=").append(time);
    sb.append(", openBid=").append(openBid);
    sb.append(", openAsk=").append(openAsk);
    sb.append(", highBid=").append(highBid);
    sb.append(", highAsk=").append(highAsk);
    sb.append(", lowBid=").append(lowBid);
    sb.append(", lowAsk=").append(lowAsk);
    sb.append(", closeBid=").append(closeBid);
    sb.append(", closeAsk=").append(closeAsk);
    sb.append(", volume=").append(volume);
    sb.append(", complete=").append(complete);
    sb.append('}');
    return sb.toString();
  }
}