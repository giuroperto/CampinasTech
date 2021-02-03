package basico.operadores

fun main() {
    val (v1, v2, v3, v4) = listOf(2, 3, 5, 8,)
    val (v5, v6, v7, v8, v9) = listOf(10, 20, 25, 30, 50)

    val resultado1: Double = (v1 * v4 + v6 - v1)-((v8 - v7) + v6).toDouble()
    val resultado2: Double = (v2 * (v2 * v2 * v2)) / (v9 - (v5 / v1 * v4)).toDouble()
    val resultado3: Double = (((v1.toDouble() * v4.toDouble()) / v2.toDouble()) + (v2.toDouble() * v4.toDouble()) / (v3.toDouble() % v2.toDouble()))

    println("Resultado 1: " + resultado1)
    println("Resultado 2: " + resultado2)
    println("Resultado 3: " + resultado3)
}