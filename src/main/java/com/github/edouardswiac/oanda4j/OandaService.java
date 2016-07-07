package com.github.edouardswiac.oanda4j;

import com.github.edouardswiac.oanda4j.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface OandaService {
  @GET("v1/instruments")
  Call<Instruments> getInstrumentList(@QueryMap Map<String, String> args);

  @GET("v1/candles")
  Call<Candles<MidpointCandle>> getMidpointCandles(@QueryMap Map<String, String> args);

  @GET("v1/candles")
  Call<Candles<BidAskCandle>> getBidAskCandles(@QueryMap Map<String, String> args);

  @GET("v1/accounts/{accountId}/orders/{orderId}")
  Call<Orders> getOrder(@Path("accountId") String accountId, @Path("orderId") String orderId, @QueryMap Map<String, String> args);

  @GET("v1/accounts/{accountId}/orders")
  Call<Orders> getOrders(@Path("accountId") String accountId, @QueryMap Map<String, String> args);

  @POST("v1/accounts/{accountId}/orders")
  Call<Orders> createOrder(@Path("accountId") String accountId, @Body Order order);

  @PATCH("v1/accounts/{accountId}/orders/{orderId}")
  Call<Orders> updateOrder(@Path("accountId") String accountId, @Path("orderId") String orderId, @Body Order order);

  @DELETE("v1/accounts/{accountId}/orders/{orderId}")
  Call<Order> closeOrder(@Path("accountId") String accountId, @Path("orderId") String orderId);

  @GET("v1/accounts/{accountId}/trades")
  Call<Trades> getOpenTrades(@Path("accountId") String accountId, @QueryMap Map<String, String> args);

  @GET("v1/accounts/{accountId}/trades/{tradeId}")
  Call<Trade> getTrade(@Path("accountId") String accountId, @Path("tradeId") String tradeId, @QueryMap Map<String, String> args);

  @PATCH("v1/accounts/{accountId}/trades/{tradeId}")
  Call<Trade> updateTrade(@Path("accountId") String accountId, @Path("tradeId") String tradeId, @Body Trade trade);

  @PATCH("v1/accounts/{accountId}/trades/{tradeId}")
  Call<Trade> closeTrade(@Path("accountId") String accountId, @Path("tradeId") String tradeId);

  @GET("v1/accounts/positions")
  Call<Positions> getOpenPositions(@Path("accountId") String accountId);

  @GET("v1/accounts/positions/{instrument}")
  Call<Position> getPositionForInstrument(@Path("accountId") String accountId, @Path("instrument") String instrument);

  @DELETE("v1/accounts/positions/{instrument}")
  Call<?> closePosition(@Path("accountId") String accountId, @Path("instrument") String instrument);
}
