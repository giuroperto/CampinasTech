package basico.operadores

fun main() {
    val a: Boolean = true
    val b: Boolean = false

    val c: Boolean = a xor b // true + false = true
    val d: Boolean = a xor c // true + true = false
    val e: Boolean = c xor d // true + false = true

    println(e)
}