package oop_00000153666_KeyzaNuryanaAlFaridzi.week01

fun main(){
    val gametitle: string = "streakw"
    val price: int = "600000"

    val discount = calculateDiscount (price)
    val finalprice = price -(price * discount / 100)
}

fun  calculateDiscount(price :int): int = if (price > 500000) 20 else 10


