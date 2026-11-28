package oop_00000153666_KeyzaNuryanaAlFaridzi.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.4, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, -12.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, 4.2, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 20, -3.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }
}