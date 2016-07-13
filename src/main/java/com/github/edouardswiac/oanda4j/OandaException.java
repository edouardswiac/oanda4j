package com.github.edouardswiac.oanda4j;

import com.github.edouardswiac.oanda4j.models.OandaError;

public final class OandaException extends RuntimeException {
  private final OandaError error;

  public OandaException(OandaError error) {
    this.error = error;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("OandaException{");
    sb.append("error=").append(error);
    sb.append('}');
    return sb.toString();
  }
}
