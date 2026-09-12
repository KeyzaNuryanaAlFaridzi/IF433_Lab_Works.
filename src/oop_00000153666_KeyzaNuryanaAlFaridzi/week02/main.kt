package oop_001_johnthor.week02

import oop_00000153666_KeyzaNuryanaAlFaridzi.oop_00000153666_KeyzaNuryanaAlFaridzi_week02.student
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()
    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine() // Consume newline

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // Consume newline

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = student(name, nim, major = major)
            println("Terdaftar di: \${s1.major} dengan GPA awal \${s1.name} - \${s1.nim}")
        } else if (type == 2) {

            val s2 = student(name, nim)
            println("Terdaftar di: \${s2.major} dengan GPA awal \${s2.name} - \${s2.nim}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}