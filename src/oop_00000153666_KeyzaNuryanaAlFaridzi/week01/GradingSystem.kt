package oop_0000015366_KeyzaNuryanaAlFaridzi.week01

fun main() {
    // Langkah 2: Refactoring Variables (Val & Type Inference)
    val name = "John Thor"
    val score = 80

    println("Nama: $name, Nilai: $score")

    // Langkah 3: Control Flow (When Expression)
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    // Langkah 4: Functions & Expression Body
    println("Status: ${calculateStatus(score)}")

    // Langkah 5: Null Safety
    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}

// Langkah 4: Fungsi di luar main dengan Expression Body
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"