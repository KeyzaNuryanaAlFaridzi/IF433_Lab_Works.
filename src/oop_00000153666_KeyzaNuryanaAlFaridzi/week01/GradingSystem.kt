package oop_00000153666_KeyzaNuryanaAlFaridzi.week01

fun main() {
   var name: string = "Keyza"
    var score : int = 80

    // concatenation gaya lama
    println ("name:" + name + ", nilai :" + score )
}

// Tulis DI LUAR main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main(){
    val name = "keyza"
    val score = 80

    println("nama: $name, nilai: $score")
}

// Tambahkan di bawah println www
val grade = when (score) {
    in 90 ≤ .. ≤ 100 -> "A"
    in 80 ≤ .. ≤ 89 -> "B"
    in 70 ≤ .. ≤ 79 -> "c"
    else > "D"
}
println("Grade kamu: $grade")

// Panggil DI DALAM main()
println("Status: ${calculateStatus(score)}")

// Tambahkan di akhir main()
val studentId: String? = null
// Jika null, gunakan nilai default 0
val idLength = studentId?.length?: 0
println("Panjang ID: $idLength")