package com.github.edouardswiac.oanda4j;


import com.github.edouardswiac.oanda4j.models.TradeCollection;

import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TradesTest extends BaseTest {

  @Test
  public void testGetOpenTrades() throws IOException {
    Call<TradeCollection> call = oandaClient.client().getOpenTrades(accountId, emptyArgs);
    Response<TradeCollection> response = call.execute();
    TradeCollection openTrades = response.body();
    assertThat(response.isSuccessful()).isTrue();
    assertThat(openTrades.getTrades()).isEmpty();
  }

}
