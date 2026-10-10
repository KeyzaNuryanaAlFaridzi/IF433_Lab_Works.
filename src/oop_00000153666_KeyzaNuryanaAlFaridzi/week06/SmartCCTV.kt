package oop_00000153666_KeyzaNuryanaAlFaridzi.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }

    override fun startRecord() {
        println("$name mulai merekam.")
    }
}