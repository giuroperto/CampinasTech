package basico.controle

import java.util.*

fun main() {
    println(whileNumeros())
}

fun whileNumeros() {
    var i: Int = 0
    val numeros: MutableList<String> = mutableListOf()

    while (i < 5) {
        println("Digite um numero")
        numeros.add(Scanner(System.`in`).nextLine())
        i += 1
    }

    for (numero in numeros) {
        when(numero) {
            "um" -> println("1 - $numero")
            "dois" -> println("2 - $numero")
            "tres" -> println("3 - $numero")
            "quatro" -> println("4 - $numero")
            "cinco" -> println("5 - $numero")
            "seis" -> println("6 - $numero")
            "sete" -> println("7 - $numero")
            "oito" -> println("8 - $numero")
            "nove" -> println("9 - $numero")
            "dez" -> println("10 - $numero")
            else -> println("Numero nao identificado")
        }
    }
}

//resolucao em aula - escrever somente os numeros de 1 a 5 e nao qualquer numero...
//fun main() {
//    val numeros: MutableList<String> = mutableListOf()
//
//    for (i in 1..5) {
//        println("Digite o valor $i desejado por extenso: ")
//        val numero = readLine()
//        numeros.add(numero.toString())
//    }
//    for((indice, numero) in numeros.withIndex()) {
//        println("${indice + 1} - $numero")
//    }
//}


//  PARA RECEBER LISTA COMO PARAMETRO
//fun recebeLista(numeros: MutableList<String>): MutableList<String> {
//    return numeros
//}
