package com.github.edouardswiac.oanda4j.integration;


import com.github.edouardswiac.oanda4j.OandaClient;
import com.github.edouardswiac.oanda4j.OandaCredentials;
import org.junit.BeforeClass;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
  static String accountId;
  static String token;
  static OandaCredentials oandaCredentials;
  static OandaClient oandaClient;

  static final Map<String, String> emptyArgs = new HashMap<>();

  @BeforeClass
  public static void init() {
    accountId = System.getenv("OANDA4J_ACCOUNT_ID");
    token = System.getenv("OANDA4J_TOKEN");
    oandaCredentials = new OandaCredentials(accountId, token, OandaCredentials.PRACTICE_ENDPOINT);
    oandaClient = new OandaClient(oandaCredentials);
  }
}