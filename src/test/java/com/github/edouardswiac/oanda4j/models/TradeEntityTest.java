package com.github.edouardswiac.oanda4j.models;

import com.github.edouardswiac.oanda4j.enums.CurrencyPair;
import com.github.edouardswiac.oanda4j.enums.OrderType;
import com.github.edouardswiac.oanda4j.enums.TradeSide;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class TradeEntityTest {

  @Test
  public void testFieldMapWithSomeFields() {
    String id = "123";
    Date expiryDate = new Date();
    BigDecimal price = new BigDecimal("1.23456");

    Map<String, String> expectedFields = Maps.newHashMap();
    expectedFields.put("id", id);
    expectedFields.put("expiry", expiryDate.toString());
    expectedFields.put("price", price.toString());

    TradeEntity t = new TradeEntity.Builder()
            .setId(id)
            .setExpiry(expiryDate)
            .setPrice(price)
            .build();

    assertThat(t.asFieldMap()).size().isEqualTo(expectedFields.size());
    assertThat(t.asFieldMap()).isEqualTo(expectedFields);
  }

  @Test
  public void testFieldMapAllFields() {
    String id = "123";
    CurrencyPair instrument = CurrencyPair.EUR_USD;
    Integer units = 2;
    TradeSide side = TradeSide.BUY;
    OrderType orderType = OrderType.MARKET;
    Date time = new Date();
    BigDecimal price = new BigDecimal(2.456);
    BigDecimal takeProfit = new BigDecimal(2);
    BigDecimal profit = new BigDecimal(2.45);
    BigDecimal stopLoss = new BigDecimal(2.4564);
    Date expiry = new Date();
    BigDecimal upperBound = new BigDecimal(2.6456);
    BigDecimal lowerBound = new BigDecimal(1.456);
    BigDecimal trailingStop = new BigDecimal("0.001");

    Map<String, String> expectedFields = Maps.newHashMap();
    expectedFields.put("id", id);
    expectedFields.put("instrument", instrument.name());
    expectedFields.put("units", units.toString());
    expectedFields.put("side", side.name().toLowerCase());
    expectedFields.put("type", orderType.name().toLowerCase());
    expectedFields.put("time", time.toString());
    expectedFields.put("price", price.toString());
    expectedFields.put("takeProfit", takeProfit.toString());
    expectedFields.put("profit", profit.toString());
    expectedFields.put("stopLoss", stopLoss.toString());
    expectedFields.put("expiry", expiry.toString());
    expectedFields.put("upperBound", upperBound.toString());
    expectedFields.put("lowerBound", lowerBound.toString());
    expectedFields.put("trailingStop", trailingStop.toString());

    TradeEntity t = new TradeEntity.Builder()
            .setId(id)
            .setInstrument(instrument)
            .setUnits(units)
            .setSide(side)
            .setOrderType(orderType)
            .setTime(time)
            .setPrice(price)
            .setTakeProfit(takeProfit)
            .setProfit(profit)
            .setStopLoss(stopLoss)
            .setExpiry(expiry)
            .setUpperBound(upperBound)
            .setLowerBound(lowerBound)
            .setTrailingStop(trailingStop)
            .build();


    assertThat(t.asFieldMap()).size().isEqualTo(expectedFields.size());
    assertThat(t.asFieldMap()).isEqualTo(expectedFields);
  }

}
