package oop_00000153666_KeyzaNuryanaAlFaridzi.oop_00000153666_KeyzaNuryanaAlFaridzi_week02

import java.util.Scanner

class studeny(
    val name: String,
    val nim: String,
    var major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()
    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine() // Bersihkan buffer newline (Penyakit klasik Scanner!)

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, 0.0, major)
        println("Status: Pendaftaran Selesai.")
    }
}


class student(
    val name: String,
    val nim: String,
    var major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }


    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}


class Student(
    val name: String,
    val nim: String,
    var gpa: Double = 0.0, // <-- Default Argument
    var major: String
) {
    constructor(name: String, nim: String, gpa: Double) : this(name, nim, gpa, "Belum Memilih")


}
