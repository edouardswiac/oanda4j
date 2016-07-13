package com.github.edouardswiac.oanda4j;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;
import com.github.edouardswiac.oanda4j.enums.OrderType;
import com.github.edouardswiac.oanda4j.enums.TradeSide;
import com.github.edouardswiac.oanda4j.interceptors.AuthorizationInterceptor;
import com.github.edouardswiac.oanda4j.interceptors.ContentTypeInterceptor;
import com.github.edouardswiac.oanda4j.interceptors.ErrorInterceptor;
import com.github.edouardswiac.oanda4j.serializers.CurrencyPairDeserializer;
import com.github.edouardswiac.oanda4j.serializers.InstantDeserializer;
import com.github.edouardswiac.oanda4j.serializers.OrderTypeDeserializer;
import com.github.edouardswiac.oanda4j.serializers.TradeSideDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.time.Instant;

public final class OandaClient {

  private final OandaService oandaService;
  private final String accountId;

  public OandaClient(final OandaCredentials oandaCredentials) {
    accountId = oandaCredentials.getAccountId();
    HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
    logging.setLevel(HttpLoggingInterceptor.Level.BODY);

    OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new AuthorizationInterceptor(oandaCredentials.getToken()))
            .addInterceptor(new ErrorInterceptor())
            .addInterceptor(new ContentTypeInterceptor())
            .addInterceptor(logging)
            .build();

    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(CurrencyPair.class, new CurrencyPairDeserializer());
    gsonBuilder.registerTypeAdapter(OrderType.class, new OrderTypeDeserializer());
    gsonBuilder.registerTypeAdapter(TradeSide.class, new TradeSideDeserializer());
    gsonBuilder.registerTypeAdapter(Instant.class, new InstantDeserializer());
    Gson gson = gsonBuilder.create();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(oandaCredentials.getEndpoint())
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    oandaService = retrofit.create(OandaService.class);
  }


  public OandaService client() {
    return oandaService;
  }

  public String accountId() {
    return accountId;
  }
}
