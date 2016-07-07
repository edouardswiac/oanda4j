package com.github.edouardswiac.oanda4j.models;

import java.util.List;

public class Candles<T extends Candle> {
  private final String instrument;
  private final String granularity;
  private final List<T> candles;

  public Candles(String instrument, String granularity, List<T> candles) {
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

  public List<T> getCandles() {
    return candles;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Candles{");
    sb.append("instrument='").append(instrument).append('\'');
    sb.append(", granularity='").append(granularity).append('\'');
    sb.append(", candles=").append(candles);
    sb.append('}');
    return sb.toString();
  }
}
