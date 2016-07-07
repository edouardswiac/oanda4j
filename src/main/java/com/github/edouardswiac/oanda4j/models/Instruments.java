package com.github.edouardswiac.oanda4j.models;

import java.util.List;

public class Instruments {

  private final List<Instrument> instruments;

  public Instruments(List<Instrument> instruments) {
    this.instruments = instruments;
  }

  public List<Instrument> getInstruments() {
    return instruments;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Instruments{");
    sb.append("instruments=").append(instruments);
    sb.append('}');
    return sb.toString();
  }
}
