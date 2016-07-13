package com.github.edouardswiac.oanda4j.models;

import java.util.List;

public class InstrumentList {

  private final List<Instrument> instruments;

  public InstrumentList(List<Instrument> instruments) {
    this.instruments = instruments;
  }

  public List<Instrument> getInstruments() {
    return instruments;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("InstrumentList{");
    sb.append("instruments=").append(instruments);
    sb.append('}');
    return sb.toString();
  }
}
