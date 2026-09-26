package oop_00000153666_KeyzaNuryanaAlFaridzi.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}