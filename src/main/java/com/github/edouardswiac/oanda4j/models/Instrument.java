package com.github.edouardswiac.oanda4j.models;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;

public final class Instrument {
  private final String displayName;
  private final CurrencyPair instrument;
  private final String pip;
  private final int maxTradeUnits;

  public Instrument(String displayName, CurrencyPair instrument, String pip, int maxTradeUnits) {
    this.displayName = displayName;
    this.instrument = instrument;
    this.pip = pip;
    this.maxTradeUnits = maxTradeUnits;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CurrencyPair getInstrument() {
    return instrument;
  }

  public String getPip() {
    return pip;
  }

  public int getMaxTradeUnits() {
    return maxTradeUnits;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("CurrencyPair{");
    sb.append("displayName='").append(displayName).append('\'');
    sb.append(", instrument='").append(instrument).append('\'');
    sb.append(", pip='").append(pip).append('\'');
    sb.append(", maxTradeUnits=").append(maxTradeUnits);
    sb.append('}');
    return sb.toString();
  }
}
