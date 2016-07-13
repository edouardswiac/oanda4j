package com.github.edouardswiac.oanda4j;

import com.github.edouardswiac.oanda4j.models.OandaError;
import com.google.gson.Gson;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ErrorInterceptor implements Interceptor {
  private static final Logger logger = LoggerFactory.getLogger(ErrorInterceptor.class);
  private static final Gson gson = new Gson();

  @Override
  public Response intercept(Chain chain) throws IOException {
    Response response = chain.proceed(chain.request());
    if(!response.isSuccessful()) {
      OandaError error = gson.fromJson(response.body().string(), OandaError.class);
      logger.error(error.getMessage());
      throw new OandaException(error);
    } else {
      return response;
    }
  }
}
