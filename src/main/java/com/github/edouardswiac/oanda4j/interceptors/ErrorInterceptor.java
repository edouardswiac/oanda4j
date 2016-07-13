package com.github.edouardswiac.oanda4j.interceptors;

import com.github.edouardswiac.oanda4j.OandaException;
import com.github.edouardswiac.oanda4j.models.OandaError;
import com.google.gson.Gson;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public final class ErrorInterceptor implements Interceptor {
  private static final Logger logger = LoggerFactory.getLogger(ErrorInterceptor.class);
  private static final Gson gson = new Gson();

  @Override
  public Response intercept(final Chain chain) throws IOException {
    final Response response = chain.proceed(chain.request());
    if(!response.isSuccessful()) {
      final OandaError error = gson.fromJson(response.body().string(), OandaError.class);
      logger.error(error.getMessage());
      throw new OandaException(error);
    } else {
      return response;
    }
  }
}
