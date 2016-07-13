package com.github.edouardswiac.oanda4j;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ContentTypeInterceptor implements Interceptor {
  private static final String ctype = "application/x-www-form-urlencoded";

  @Override
  public Response intercept(Chain chain) throws IOException {
    Request request = chain.request().newBuilder().addHeader("content-type", ctype).build();
    return chain.proceed(request);
  }
}
