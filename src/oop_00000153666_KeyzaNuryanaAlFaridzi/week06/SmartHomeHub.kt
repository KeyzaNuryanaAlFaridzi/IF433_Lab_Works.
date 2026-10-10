package oop_00000153666_KeyzaNuryanaAlFaridzi.week06

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} berhasil ditambahkan ke Smart Home Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== Mematikan Semua Perangkat ===")

        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

   }