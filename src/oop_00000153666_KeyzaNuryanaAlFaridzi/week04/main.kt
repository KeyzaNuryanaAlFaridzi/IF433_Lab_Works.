package oop_00000153666_KeyzaNuryanaAlFaridzi.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEV = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myEV.openTrunk()
    myEV.honk()
    myEV.accelerate()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Budi", baseSalary = 10000000)
    val developer = Developer(name = "Andi", baseSalary = 8000000, programmingLanguage = "Kotlin")

    manager.work()
    println("Bonus Manager (${manager.name}): Rp ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer (${developer.name}): Rp ${developer.calculateBonus()}")
}
