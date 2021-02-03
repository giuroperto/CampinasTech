package basico.operadores

import java.util.*

fun main() {
    // print n quebra linha e println quebra

    // tipos de operadores logicos
    // == -> se os tipos e valores sao iguais
    // === -> se os tipos e valores sao iguais + referencia e posicao do objeto na memoria

    val d1 = Date( 0) // kotlin memoria 7882734
    val d2 = Date( 0) // kotlin memoria 4282337

    println(d1 === d2) // false
    println(d1 == d2) // true
    // ja que muda o espaco de memoria, apesar das datas serem identicas -> as instancias sao diferentes


//    println("Igual a ")
//    println("Giulia" == "giulia")


//    println("Diferente ")
//    println(3 != 2)
//    println("Menor que ")
//    println(3 < 2)
//    println("Maior que ")
//    println(3 > 2)
//    println("Menor ou igual a ")
//    println(3 <= 2)
//    println("Maior ou igual a ")
//    println(3 >= 2)

    // operadores E (&&) e OU (||)

    val x: Boolean = true
    val y: Boolean = true

    val z: Boolean = x || y
    val w: Boolean = x && y
    val v: Boolean = x xor y

    println("Boolean de z: " +z)
    println("Boolean de w: " +w)
    println("Boolean de v: " +v)

    // ou exclusivo, vem de C
    // XOR (or exclusivo) somente verdade quando os valores das condicoes forem diferentes
//    println()
}