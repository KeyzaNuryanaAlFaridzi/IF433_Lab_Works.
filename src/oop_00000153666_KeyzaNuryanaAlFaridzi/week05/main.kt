package oop_00000153666_KeyzaNuryanaAlFaridzi.week05

fun main() {
    // val p = Pegawai("Test") // Error! Abstract class tidak bisa di-instansiasi.

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection
    val daftarPegawai: List<pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting menggunakan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast!
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }
}