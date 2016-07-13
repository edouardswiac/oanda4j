package com.github.edouardswiac.oanda4j.models;

import java.math.BigDecimal;
import java.time.Instant;

public final class MidpointCandle implements Candle {
  private final Instant time;
  private final BigDecimal openMid;
  private final BigDecimal highMid;
  private final BigDecimal lowMid;
  private final BigDecimal closeMid;
  private final double volume;
  private final boolean complete;

  public MidpointCandle(Instant time, BigDecimal openMid, BigDecimal highMid, BigDecimal lowMid, BigDecimal closeMid, double volume, boolean complete) {
    this.time = time;
    this.openMid = openMid;
    this.highMid = highMid;
    this.lowMid = lowMid;
    this.closeMid = closeMid;
    this.volume = volume;
    this.complete = complete;
  }

  public Instant getTime() {
    return time;
  }

  public BigDecimal getOpenMid() {
    return openMid;
  }

  public BigDecimal getHighMid() {
    return highMid;
  }

  public BigDecimal getLowMid() {
    return lowMid;
  }

  public BigDecimal getCloseMid() {
    return closeMid;
  }

  public double getVolume() {
    return volume;
  }

  public boolean isComplete() {
    return complete;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("MidpointCandle{");
    sb.append("time=").append(time);
    sb.append(", openMid=").append(openMid);
    sb.append(", highMid=").append(highMid);
    sb.append(", lowMid=").append(lowMid);
    sb.append(", closeMid=").append(closeMid);
    sb.append(", volume=").append(volume);
    sb.append(", complete=").append(complete);
    sb.append('}');
    return sb.toString();
  }
}
