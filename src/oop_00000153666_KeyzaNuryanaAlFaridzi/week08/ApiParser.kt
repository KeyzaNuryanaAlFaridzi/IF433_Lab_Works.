package oop_00000153666_KeyzaNuryanaAlFaridzi.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name for ID $id"
        }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Electronic -> {
                println("Memproses Elektronik: ${product.name} (Garansi: ${product.warrantyMonths} bulan)")
                product.id
            }
            is Clothing -> {
                println("Memproses Pakaian: ${product.name} (Ukuran: ${product.size})")
                product.id
            }
        }

        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Transaction ID: $transactionId")
    }
}