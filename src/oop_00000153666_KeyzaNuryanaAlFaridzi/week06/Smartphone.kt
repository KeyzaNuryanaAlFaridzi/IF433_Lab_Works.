package oop_00000153666_KeyzaNuryanaAlFaridzi.week06

class Smartphone : Camera, Phone {

    override fun turnOn() {
        fun turnOnCamera()
        super<Phone>.turnOn()
        println("Smartphone siap digunakan.")
    }

}