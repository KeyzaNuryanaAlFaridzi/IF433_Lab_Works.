package oop_00000153666_KeyzaNuryanaAlFaridzi.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}