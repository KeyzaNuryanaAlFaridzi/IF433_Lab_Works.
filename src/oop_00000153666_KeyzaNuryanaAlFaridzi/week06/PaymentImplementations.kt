package oop_00000153666_KeyzaNuryanaAlFaridzi.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Pembayaran GoPay sebesar Rp$amount berhasil.")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Pembayaran kartu kredit sebesar Rp$amount berhasil.")
    }
}