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

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            val sign = if (it.roe > 0) "+" else ""
            "WIN [${it.pair} ${it.position}]: $sign${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            val sign = if (it.roe > 0) "+" else ""
            "LOSS [${it.pair} ${it.position}]: $sign${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }

    worstPerformersString.forEach { println(it) }
    println("Unique Pairs: $uniquePairs")

    package oop_00000153666_keyza.week09

    fun main() {
        val tradeHistory = listOf(
            TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
            TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
            TradeLog("BTCUSDT", "SHORT", 15, -12.4, "CLOSED"),
            TradeLog("SOLUSDT", "LONG", 25, 22.8, "CLOSED"),
            TradeLog("BTCUSDT", "LONG", 20, 8.0, "OPEN"),
            TradeLog("ETHUSDT", "LONG", 10, -3.5, "OPEN")
        )

        val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
        val winningTrades = closedTrades.filter { it.roe > 0.0 }
        val losingTrades = closedTrades.filter { it.roe <= 0.0 }

        val topPerformersString = winningTrades
            .sortedByDescending { it.roe }
            .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

        val worstPerformersString = losingTrades
            .sortedBy { it.roe }
            .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

        val uniquePairs = tradeHistory
            .map { it.pair }
            .toSet()

        println("=== CRYPTO TRADING DASHBOARD ===")
        topPerformersString.forEach { println(it) }
        worstPerformersString.forEach { println(it) }
        println("Unique Pairs: $uniquePairs")
    }
}