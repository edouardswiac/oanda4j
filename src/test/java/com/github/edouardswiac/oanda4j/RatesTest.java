package com.github.edouardswiac.oanda4j;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;
import com.github.edouardswiac.oanda4j.enums.Granularity;
import com.github.edouardswiac.oanda4j.models.*;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class RatesTest extends BaseTest{

  @Test
  public void testGetInstrumentList() throws IOException {
    Map<String, String> options = new HashMap<String, String>();
    options.put("accountId", oandaCredentials.getAccountId());

    Call<InstrumentList> call = oandaClient.client().getInstrumentList(options);
    Response<InstrumentList> response = call.execute();

    InstrumentList instrumentList = response.body();
    assertThat(response.isSuccessful()).isTrue();
    assertThat(instrumentList.getInstruments()).isNotEmpty();
  }


  @Test
  public void testGetMidpointCandles() throws IOException {
    Map<String, String> options = new HashMap<String, String>();
    options.put("instrument", CurrencyPair.EUR_USD.name());
    options.put("granularity", Granularity.M1.name());
    options.put("count", "5");

    Call<CandleList<MidpointCandle>> call = oandaClient.client().getMidpointCandles(options);
    Response<CandleList<MidpointCandle>> response = call.execute();

    CandleList<MidpointCandle> candleList = response.body();
    assertThat(response.isSuccessful()).isTrue();
    assertThat(candleList.getInstrument()).isEqualTo(CurrencyPair.EUR_USD.name());
  }

  @Test
  public void testGetBidAskCandle() throws IOException {
    Map<String, String> options = new HashMap<String, String>();
    options.put("instrument", CurrencyPair.EUR_USD.name());
    options.put("granularity",  Granularity.M1.name());
    options.put("count", "5");

    Call<CandleList<BidAskCandle>> call = oandaClient.client().getBidAskCandles(options);
    Response<CandleList<BidAskCandle>> response = call.execute();

    CandleList<BidAskCandle> candleList = response.body();
    assertThat(response.isSuccessful()).isTrue();
    assertThat(candleList.getInstrument()).isEqualTo(CurrencyPair.EUR_USD.name());
  }


}
