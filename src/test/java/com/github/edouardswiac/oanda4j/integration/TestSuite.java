package com.github.edouardswiac.oanda4j.integration;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  OrdersTest.class,
  RatesTest.class,
  TradesTest.class
})

public class TestSuite { }
