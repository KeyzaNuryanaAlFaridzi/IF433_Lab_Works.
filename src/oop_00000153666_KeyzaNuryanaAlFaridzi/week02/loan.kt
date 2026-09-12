package oop_00000153666_KeyzaNuryanaAlFaridzi.oop_00000153666_KeyzaNuryanaAlFaridzi_week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- SISTEM PEMINJAMAN BUKU ---")
    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()
    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()
    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("WARNING: Lama pinjam tidak boleh minus. Otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjam   : ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}