package com.github.edouardswiac.oanda4j.models;

import java.util.Collection;

public final class TradeCollection {
  private Collection<TradeEntity> trades;

  private TradeCollection() {}

  public Collection<TradeEntity> getTrades() {
    return trades;
  }
}
