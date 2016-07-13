package com.github.edouardswiac.oanda4j.interceptors;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public final class AuthorizationInterceptor implements Interceptor {

  private final String oandaToken;

  public AuthorizationInterceptor(String oandaToken) {
    this.oandaToken = oandaToken;
  }

  @Override
  public Response intercept(Interceptor.Chain chain) throws IOException {
    Request original = chain.request();

    // Request customization: add request headers
    Request.Builder requestBuilder = original.newBuilder()
            .addHeader("Authorization", String.format("Bearer %s", oandaToken));

    Request request = requestBuilder.build();
    return chain.proceed(request);
  }
}
