package com.github.edouardswiac.oanda4j;

public final class OandaCredentials {
  private final String accountId;
  private final String token;
  private final String endpoint;

  public static final String PRACTICE_ENDPOINT =  "https://api-fxpractice.oanda.com";
  public static final String PRODUCTION_ENDPOINT = "https://api-fxtrade.oanda.com";


  public OandaCredentials(String accountId, String token, String endpoint) {
    this.accountId = accountId;
    this.token = token;
    this.endpoint = endpoint;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getToken() {
    return token;
  }

  public String getEndpoint() {
    return endpoint;
  }
}
