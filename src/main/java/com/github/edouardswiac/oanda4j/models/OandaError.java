package com.github.edouardswiac.oanda4j.models;

public final class OandaError {
  private final int code;
  private final String message;
  private final String moreInfo;

  public OandaError(int code, String message, String moreInfo) {
    this.code = code;
    this.message = message;
    this.moreInfo = moreInfo;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public String getMoreInfo() {
    return moreInfo;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("OandaError{");
    sb.append("code=").append(code);
    sb.append(", message='").append(message).append('\'');
    sb.append(", moreInfo='").append(moreInfo).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
