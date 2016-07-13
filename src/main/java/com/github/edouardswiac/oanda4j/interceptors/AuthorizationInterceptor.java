package com.github.edouardswiac.oanda4j.interceptors;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public final class AuthorizationInterceptor implements Interceptor {

  private final String oandaToken;

  public AuthorizationInterceptor(final String oandaToken) {
    this.oandaToken = oandaToken;
  }

  @Override
  public Response intercept(final Interceptor.Chain chain) throws IOException {
    final Request original = chain.request();

    final Request.Builder requestBuilder = original.newBuilder()
            .addHeader("Authorization", String.format("Bearer %s", oandaToken));

    final Request request = requestBuilder.build();
    return chain.proceed(request);
  }
}
