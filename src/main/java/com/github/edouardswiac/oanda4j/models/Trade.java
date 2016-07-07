package com.github.edouardswiac.oanda4j.models;

public final class Trade {
}


/*
{
  "id" : 43211,                          // The ID of the trade
  "units" : 5,                           // The number of units in the trade
  "side" : "buy",                        // The direction of the trade
  "instrument" : "EUR_USD",              // The symbol of the instrument of the trade
  "time" : "2013-07-03T14:30:38Z",       // The time of the trade (in RFC3339 format)
  "price" : 1.45123,                     // The price the trade was executed at
  "takeProfit" : 1.7,                    // The take-profit associated with the trade, if any
  "stopLoss" : 1.4,                      // The stop-loss associated with the trade, if any
  "trailingStop" : 50                    // The trailing stop associated with the trade, if any
  "trailingAmount" : 1.44613             // The trailing amount associated with the trade, if any.
                                            Returns -1 if our trailing amount server is unavailable
}
 */