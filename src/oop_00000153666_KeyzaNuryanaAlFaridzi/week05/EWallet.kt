package oop_00000153666_KeyzaNuryanaAlFaridzi.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - EWallet] Pembayaran sebesar Rp$amount BERHASIL. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName - EWallet] Pembayaran sebesar Rp$amount GAGAL: Saldo tidak cukup (Saldo saat ini: Rp$balance)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - EWallet] Top Up sebesar Rp$amount BERHASIL. Saldo sekarang: Rp$balance")
    }
}