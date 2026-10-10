package oop_00000153666_KeyzaNuryanaAlFaridzi.week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("$name telah diklik.")
    }
}

