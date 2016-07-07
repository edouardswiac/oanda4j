package com.github.edouardswiac.oanda4j;

import com.github.edouardswiac.oanda4j.models.BidAskCandle;
import com.github.edouardswiac.oanda4j.models.Candles;
import com.github.edouardswiac.oanda4j.models.Instruments;
import com.github.edouardswiac.oanda4j.models.Orders;
import org.junit.BeforeClass;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class OandaClientTest {

  static OandaCredentials oandaCredentials;
  static OandaClient oandaClient;

  @BeforeClass
  public static void init() {
    String accountId = System.getenv("OANDA4J_ACCOUNT_ID");
    String token = System.getenv("OANDA4J_TOKEN");
    oandaCredentials = new OandaCredentials(accountId, token, OandaCredentials.PRACTICE_ENDPOINT);
    oandaClient = new OandaClient(oandaCredentials);
  }

  @Test
  public void testNotSuccessfulIfNotAuthenticated() throws IOException {
    Map<String, String> options = new HashMap<String, String>();

    Call<Instruments> call = oandaClient.client().getInstrumentList(options);
    assertThat(call.execute().isSuccessful()).isFalse();
  }

  @Test
  public void testGetMidpointCandles() throws IOException {
    Map<String, String> options = new HashMap<String, String>();
    options.put("instrument", "EUR_USD");
    options.put("granularity", "M1");
    options.put("count", "5");

    Call<Candles<BidAskCandle>> call = oandaClient.client().getBidAskCandles(options);
    Response<Candles<BidAskCandle>> response = call.execute();

    Candles<BidAskCandle> candles = response.body();
    assertThat(response.isSuccessful()).isTrue();
    assertThat(candles.getInstrument()).isEqualTo("EUR_USD");
  }

  @Test
  public void testGetInstrumentList() throws IOException {
    Map<String, String> options = new HashMap<String, String>();
    options.put("accountId", oandaCredentials.getAccountId());

    Call<Instruments> call = oandaClient.client().getInstrumentList(options);
    Response<Instruments> response = call.execute();

    Instruments instruments = response.body();
    assertThat(response.isSuccessful()).isTrue();
    assertThat(instruments.getInstruments()).isNotEmpty();
  }

  @Test
  public void testGetOrders() throws IOException {
    Map<String, String> options = new HashMap<String, String>();

    Call<Orders> call = oandaClient.client().getOrders(oandaCredentials.getAccountId(), options);
    Response<Orders> response = call.execute();

    assertThat(response.isSuccessful()).isTrue();
  }

  @Test
  public void testGetOrder() throws IOException {
    Map<String, String> options = new HashMap<String, String>();

    Call<Orders> call = oandaClient.client().getOrders(oandaCredentials.getAccountId(), options);
    Response<Orders> response = call.execute();

    assertThat(response.isSuccessful()).isTrue();
  }

  @Test
  public void testCreateOrder() throws IOException {

  }
}
