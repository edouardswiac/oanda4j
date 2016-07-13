package com.github.edouardswiac.oanda4j.models;

import java.util.Collection;

public final class CandleList<T extends Candle> {
  private final String instrument;
  private final String granularity;
  private final Collection<T> candles;

  public CandleList(String instrument, String granularity, Collection<T> candles) {
    this.instrument = instrument;
    this.granularity = granularity;
    this.candles = candles;
  }

  public String getInstrument() {
    return instrument;
  }

  public String getGranularity() {
    return granularity;
  }

  public Collection<T> getCandles() {
    return candles;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("CandleList{");
    sb.append("instrument='").append(instrument).append('\'');
    sb.append(", granularity='").append(granularity).append('\'');
    sb.append(", candles=").append(candles);
    sb.append('}');
    return sb.toString();
  }
}
