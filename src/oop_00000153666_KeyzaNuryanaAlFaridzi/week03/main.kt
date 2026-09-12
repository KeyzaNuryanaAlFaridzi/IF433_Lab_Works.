package oop_00000153666_KeyzaNuryanaAlFaridzi.week03

import oop_00000153666_KeyzaNuryanaAlFaridzi.week03.Weapon

fun main() {
    val e = Employee("Budi")


    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val sword = Weapon("Excalibur")
    sword.damage = -50
    sword.damage = 9999
    println("Damage: ${sword.damage}, Tier: ${sword.tier}")

    val player = Player("JohnThor")
    player.addXp(50)
    player.addXp(60)
    println("Level akhir: ${player.level}")
}