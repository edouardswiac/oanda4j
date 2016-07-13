package com.github.edouardswiac.oanda4j.serializers;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public final class CurrencyPairDeserializer implements JsonDeserializer<CurrencyPair> {
  @Override
  public CurrencyPair deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    return CurrencyPair.valueOf(json.getAsString());
  }
}
