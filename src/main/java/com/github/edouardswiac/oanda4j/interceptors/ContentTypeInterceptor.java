package com.github.edouardswiac.oanda4j.interceptors;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public final class ContentTypeInterceptor implements Interceptor {
  private static final String ctype = "application/x-www-form-urlencoded";

  @Override
  public Response intercept(final Chain chain) throws IOException {
    final Request request = chain.request().newBuilder().addHeader("content-type", ctype).build();
    return chain.proceed(request);
  }
}
