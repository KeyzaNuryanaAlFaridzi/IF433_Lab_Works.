package oop_00000153666_KeyzaNuryanaAlFaridzi.week08

fun main() {
    val rawApiData = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                parser.checkout(it)
            } ?: println("Log: Tipe produk tidak dikenali, item di-skip (${raw["name"]}).")
        } catch (e: IllegalArgumentException) {
            println("Peringatan Log (Data Korup): ${e.message}")
        }
    }
}