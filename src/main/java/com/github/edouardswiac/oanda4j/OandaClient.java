package com.github.edouardswiac.oanda4j;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class OandaClient {

  private final OandaService oandaService;

  public OandaClient(OandaCredentials oandaCredentials) {
    OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new AuthorizationInterceptor(oandaCredentials.getToken()))
            .addInterceptor(new LoggingInterceptor())
            .build();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(oandaCredentials.getEndpoint())
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    oandaService = retrofit.create(OandaService.class);
  }

  public OandaService client() {
    return oandaService;
  }

}
