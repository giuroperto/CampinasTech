package basico

// CASTING
//fun main() {
//    val a: String = "1"
//    val b: String = "2"
//
//    val c: Int = a.toInt() + b.toInt()
//
//    println(c)
//}

//fun main() {
//    val valor = "abc"
//
//    if (valor is String) {
//        println(valor)
//    } else {
//        println("nao e uma string")
//    }
//}

// smart cast
fun main() {
    podeMostrarStringOuSoma(true)
}

fun podeMostrarStringOuSoma(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Isso e diferente de String e Inteiro")
    }
}