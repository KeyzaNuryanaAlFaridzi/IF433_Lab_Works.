package oop_00000153666_KeyzaNuryanaAlFaridzi.week06

fun processCheckout(
    paymentMethod: PaymentMethod,
    amount: Double
) {
    println("Memproses checkout...")
    paymentMethod.pay(amount)
}

fun main() {
    val lamp = SmartLamp("L001", "Ruang Tamu")
    val speaker = SmartSpeaker("S001", "Google Nest Dapur")
    val cctv = SmartCCTV("C001", "Ezviz Garasi")
    val gopay = Gopay()
    val creditCard = CreditCard()

    processCheckout(gopay, 50000.0)
    processCheckout(creditCard, 100000.0)

    val smartwatch = Smartwatch()
    smartwatch.showTime()
    smartwatch.connectToBluetooth()
    smartwatch.chargeBattery()

    val smartphone = Smartphone()
    smartphone.turnOn()
    smartphone.turnOnCamera()

    val button = Button("Login")
    button.click()

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()

}
