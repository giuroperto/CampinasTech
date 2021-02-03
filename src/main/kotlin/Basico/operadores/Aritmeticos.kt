package basico.operadores

fun main() {
    val (v1, v2, v3, v4) = listOf(3, 2, 4, 5)

    val soma = v1 + v2 + v3 + v4
    val subtracao = v4 - v1 - v2
    val divisao = v3 / v2
    val multiplicacao = v4 * v2
    val modulo = v4 % v1

    println("soma = " + soma)
    println("subtracao de v4, v1 e v2 = " + subtracao)
    println("divisao de v3 por v2 = " + divisao)
    println("multiplicacao de v4 por v2 = " + multiplicacao)
    println("modulo de v4 por v1 = " + modulo)
}