package com.github.edouardswiac.oanda4j.models;

import java.util.Collection;

public class PositionList {
  private final Collection<Position> positions;

  public PositionList(Collection<Position> positions) {
    this.positions = positions;
  }

  public Collection<Position> getPositions() {
    return positions;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("PositionList{");
    sb.append("positions=").append(positions);
    sb.append('}');
    return sb.toString();
  }
}
