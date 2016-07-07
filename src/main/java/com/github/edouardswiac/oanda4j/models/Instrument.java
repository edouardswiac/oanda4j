package com.github.edouardswiac.oanda4j.models;

public final class Instrument {
  private final String displayName;
  private final String instrument;
  private final String pip;
  private final int maxTradeUnits;

  public Instrument(String displayName, String instrument, String pip, int maxTradeUnits) {
    this.displayName = displayName;
    this.instrument = instrument;
    this.pip = pip;
    this.maxTradeUnits = maxTradeUnits;
  }

  public String getDisplayName() {
    return displayName;
  }

  public String getInstrument() {
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
    final StringBuffer sb = new StringBuffer("Instrument{");
    sb.append("displayName='").append(displayName).append('\'');
    sb.append(", instrument='").append(instrument).append('\'');
    sb.append(", pip='").append(pip).append('\'');
    sb.append(", maxTradeUnits=").append(maxTradeUnits);
    sb.append('}');
    return sb.toString();
  }
}
