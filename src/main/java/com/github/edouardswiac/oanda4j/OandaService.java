package com.github.edouardswiac.oanda4j;

import com.github.edouardswiac.oanda4j.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface OandaService {
  @GET("v1/instruments")
  Call<InstrumentList> getInstrumentList(@QueryMap Map<String, String> args);

  @GET("v1/candles")
  Call<CandleList<MidpointCandle>> getMidpointCandles(@QueryMap Map<String, String> args);

  @GET("v1/candles")
  Call<CandleList<BidAskCandle>> getBidAskCandles(@QueryMap Map<String, String> args);

  @GET("v1/accounts/{accountId}/orders/{orderId}")
  Call<OrderList> getOrder(@Path("accountId") String accountId, @Path("orderId") String orderId, @QueryMap Map<String, String> args);

  @GET("v1/accounts/{accountId}/orders")
  Call<OrderList> getOrders(@Path("accountId") String accountId, @QueryMap Map<String, String> args);

  @FormUrlEncoded
  @POST("v1/accounts/{accountId}/orders")
  Call<OrderResponse> createOrder(@Path("accountId") String accountId, @FieldMap Map<String, String> fieldMap);

  @PATCH("v1/accounts/{accountId}/orders/{orderId}")
  Call<OrderList> updateOrder(@Path("accountId") String accountId, @Path("orderId") String orderId, @Body TradeEntity order);

  @DELETE("v1/accounts/{accountId}/orders/{orderId}")
  Call<TradeEntity> closeOrder(@Path("accountId") String accountId, @Path("orderId") String orderId);

  @GET("v1/accounts/{accountId}/trades")
  Call<TradeCollection> getOpenTrades(@Path("accountId") String accountId, @QueryMap Map<String, String> args);

  @GET("v1/accounts/{accountId}/trades/{tradeId}")
  Call<TradeEntity> getTrade(@Path("accountId") String accountId, @Path("tradeId") String tradeId, @QueryMap Map<String, String> args);

  @PATCH("v1/accounts/{accountId}/trades/{tradeId}")
  Call<TradeEntity> updateTrade(@Path("accountId") String accountId, @Path("tradeId") String tradeId, @Body TradeEntity trade);

  @DELETE("v1/accounts/{accountId}/trades/{tradeId}")
  Call<TradeEntity> closeTrade(@Path("accountId") String accountId, @Path("tradeId") String tradeId);

  @GET("v1/accounts/positions")
  Call<PositionList> getOpenPositions(@Path("accountId") String accountId);

  @GET("v1/accounts/positions/{instrument}")
  Call<Position> getPositionForInstrument(@Path("accountId") String accountId, @Path("instrument") String instrument);

  @DELETE("v1/accounts/positions/{instrument}")
  Call<?> closePosition(@Path("accountId") String accountId, @Path("instrument") String instrument);
}
