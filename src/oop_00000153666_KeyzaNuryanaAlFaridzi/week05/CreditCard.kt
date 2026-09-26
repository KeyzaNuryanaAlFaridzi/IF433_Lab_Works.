package oop_00000153666_KeyzaNuryanaAlFaridzi.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - CreditCard] Pembayaran sebesar Rp$amount BERHASIL. Total terpakai: Rp$usedAmount / Limit: Rp$limit")
        } else {
            println("[$accountName - CreditCard] Transaksi sebesar Rp$amount DITOLAK: Melebihi batas limit kredit!")
        }
    }
}