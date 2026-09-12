package oop_00000153666_KeyzaNuryanaAlFaridzi.oop_00000153666_KeyzaNuryanaAlFaridzi_week02

import java.util.Scanner

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- MINI RPG BATTLE ---")
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(name = heroName, baseDamage = damage)
    var enemyHp = 100

    println("\nBattle dimulai antara ${hero.name} melawan Enemy (HP: $enemyHp)!\n")

    while (hero.isAlive() && enemyHp > 0) {
        println("Status -> ${hero.name} HP: ${hero.hp} | Enemy HP: $enemyHp")
        println("Menu: 1. Serang | 2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik dan memberikan damage sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP ${hero.name}: ${hero.hp}\n")
            }
        } else if (choice == 2) {
            println("${hero.name} memilih untuk kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n--- PERTARUNGAN SELESAI ---")
    if (hero.hp <= 0) {
        println("Game Over! ${hero.name} telah dikalahkan.")
    } else if (enemyHp <= 0) {
        println("Victory! ${hero.name} berhasil mengalahkan musuh!")
    } else {
        println("Pertarungan dihentikan.")
    }
}