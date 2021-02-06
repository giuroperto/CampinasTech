package basico

import java.util.*

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
//    podeMostrarStringOuSoma(true)

    println("Digite a sua entrada")
    val entrada: Int = Scanner(System.`in`).nextInt()
    println(casting(entrada))
}

fun podeMostrarStringOuSoma(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Isso e diferente de String e Inteiro")
    }
}

// 1) Verificar o tipo de variavel que esta passando, caso eu informe uma String, me informe, "O tipo de variavel e uma String"
// assim para os outros tipos, deve ser solicitado a entrada pelo teclado.

fun casting(entrada: Any): String {
    val response: String
    when(entrada) {
        is String -> response = "O tipo de variavel e uma String"
        is Int -> response = "O tipo de variavel e uma Int"
        is Double -> response = "O tipo de variavel e uma Double"
        is Boolean -> response = "O tipo de variavel e um boleano"
        else -> response = "Tipo nao identificado"
    }

    return response
}