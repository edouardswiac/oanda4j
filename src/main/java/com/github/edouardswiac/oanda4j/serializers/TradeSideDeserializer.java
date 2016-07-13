package com.github.edouardswiac.oanda4j.serializers;

import com.github.edouardswiac.oanda4j.enums.TradeSide;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public final class TradeSideDeserializer implements JsonDeserializer<TradeSide> {
  @Override
  public TradeSide deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    return TradeSide.valueOf(json.getAsString().toUpperCase());
  }
}
