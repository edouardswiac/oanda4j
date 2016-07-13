package com.github.edouardswiac.oanda4j.serializers;

import com.github.edouardswiac.oanda4j.enums.OrderType;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class OrderTypeDeserializer implements JsonDeserializer<OrderType> {
  @Override
  public OrderType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    return OrderType.valueOf(json.getAsString().toUpperCase());
  }
}
