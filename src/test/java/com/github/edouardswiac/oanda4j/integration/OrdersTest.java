package com.github.edouardswiac.oanda4j.integration;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;
import com.github.edouardswiac.oanda4j.enums.OrderType;
import com.github.edouardswiac.oanda4j.enums.TradeSide;
import com.github.edouardswiac.oanda4j.models.OrderList;
import com.github.edouardswiac.oanda4j.models.OrderResponse;
import com.github.edouardswiac.oanda4j.models.TradeEntity;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class OrdersTest extends BaseTest {
  @Test
  public void testGetOrders() throws IOException {
    Map<String, String> options = new HashMap<String, String>();

    Call<OrderList> call = oandaClient.client().getOrders(oandaCredentials.getAccountId(), options);
    Response<OrderList> response = call.execute();

    assertThat(response.isSuccessful()).isTrue();
  }

  @Test
  public void testGetOrder() throws IOException {
    Map<String, String> options = new HashMap<String, String>();

    Call<OrderList> call = oandaClient.client().getOrders(oandaCredentials.getAccountId(), options);
    Response<OrderList> response = call.execute();

    assertThat(response.isSuccessful()).isTrue();
  }

  @Test
  public void testCreateMarketOrder() throws Exception {
    TradeEntity order = new TradeEntity.Builder()
            .setInstrument(CurrencyPair.USD_CAD)
            .setOrderType(OrderType.MARKET)
            .setUnits(1)
            .setSide(TradeSide.BUY)
            .build();

    Call<OrderResponse> call = oandaClient.client().createOrder(oandaCredentials.getAccountId(), order.asFieldMap());
    Response<OrderResponse> response = call.execute();

    assertThat(response.isSuccessful()).isTrue();
    TradeEntity trade = response.body().getTradeOpened();
    oandaClient.client().closeTrade(accountId, trade.getId()).execute();
  }

  @Test
  public void testCreateOpenOrder() throws Exception {
    TradeEntity order = new TradeEntity.Builder()
            .setInstrument(CurrencyPair.USD_CZK)
            .setOrderType(OrderType.LIMIT)
            .setPrice(new BigDecimal(9.12345))
            .setUnits(1)
            .setExpiry(Instant.now().plus(Duration.ofSeconds(10)))
            .setSide(TradeSide.BUY)
            .build();

    Call<OrderResponse> call = oandaClient.client().createOrder(oandaCredentials.getAccountId(), order.asFieldMap());
    Response<OrderResponse> response = call.execute();

    assertThat(response.isSuccessful()).isTrue();
    TradeEntity trade = response.body().getOrderOpened();
    oandaClient.client().closeOrder(accountId, trade.getId()).execute();
  }
}
