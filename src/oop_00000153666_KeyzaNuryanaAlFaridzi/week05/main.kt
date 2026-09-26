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
    println("=== TUGAS 1: MATH HELPER (OVERLOADING) ===")
    val math = MathHelper()
    println("Luas Persegi (sisi 4): ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang (4 x 5): ${math.hitungLuas(4, 5)}")
    println("Luas Lingkaran (r = 7.0): ${math.hitungLuas(7.0)}")
    println()

    println("=== TUGAS 2: SISTEM PEMBAYARAN ===")
    val wallet = EWallet(accountName = "John Thor", balance = 50000.0)
    val card = CreditCard(accountName = "John Thor", limit = 100000.0)
    val listPembayaran: List<PaymentMethod> = listOf(wallet, card)
    for (payment in listPembayaran) {
        payment.processPayment(75000.0)
    }

    println("\n=== TUGAS 2: SMART CASTING RECOVERY ===")
    for (payment in listPembayaran) {
        payment.processPayment(75000.0)

        // Smart Casting Challenge
        if (payment is EWallet) {
            println("-> Mendeteksi EWallet, mencoba Top Up otomatis...")
            payment.topUp(50000.0)
            println("-> Mencoba pembayaran ulang setelah Top Up:")
            payment.processPayment(75000.0)
        }
        println("----------------------------------------")
    }
}