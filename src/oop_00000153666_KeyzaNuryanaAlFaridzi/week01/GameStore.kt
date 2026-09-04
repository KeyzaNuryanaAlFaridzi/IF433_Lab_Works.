package oop_00000153666_KeyzaNuryanaAlFaridzi.week01

fun main(){
    val gametitle: string = "streakw"
    val price: int = "600000"

    val discount = calculateDiscount (price)
    val finalprice = price -(price * discount / 100)
}

fun  calculateDiscount(price :int): int = if (price > 500000) 20 else 10

fun main(){
    val gametitile = "streak"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - (price * discount / 100)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

fun printReceipt(title: String, finalPrice: Int) {
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
}




