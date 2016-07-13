package com.github.edouardswiac.oanda4j.models;

public class OandaError {
  private int code;
  private String message;
  private String moreInfo;

  private OandaError() {}

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
