package oop_00000153666_KeyzaNuryanaAlFaridzi.week01

fun main (args: Array<String>){
// Variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14

// Calculation
    var area: Double = pi * radius * radius
}

// Output Concatenation
println("Radius: " + radius + ", Area: " + area)
// Logic check
checksize (area)
}
fun checksize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}

fun main (args: Array<String>){
// Variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14

// Calculation
    var area: Double = pi * radius * radius
}

// Output Concatenation
println("Radius: " + radius + ", Area: " + area)

// Logic check
checksize (area)
}

fun checksize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}

fun main(args: Array<String>) {
    // REFACTOR: Gunakan val dan hapus tipe data eksplisit (Type Inference)
    val radius = 7.0
    val pi = 3.14

    // REFACTOR: Gunakan val untuk area
    val area = pi * radius * radius

    // REFACTOR: Gunakan String Template ($radius, $area)
    println("Radius: $radius, Area: $area")

    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}

package oop_00000153666_KeyzaNuryanaAlFaridzi.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println(checkSize(area))
}
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"