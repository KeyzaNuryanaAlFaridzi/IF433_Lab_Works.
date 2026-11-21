package UTS_00000153666_KeyzaNuryanaAlFaridzi

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}