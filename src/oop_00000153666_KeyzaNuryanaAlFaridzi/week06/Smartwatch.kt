package oop_00000153666_KeyzaNuryanaAlFaridzi.week06

import oop_00000153666_KeyzaNuryanaAlFaridzi.week06got.Watch

class Smartwatch : Watch(),
    BluetoothConnectable,
    Rechargeable {

    override fun showTime() {
        println("Menampilkan waktu pada smartwatch.")
    }

    override fun connectToBluetooth() {
        println("Smartwatch terhubung ke Bluetooth.")
    }

    override fun chargeBattery() {
        println("Baterai smartwatch sedang diisi.")
    }
}