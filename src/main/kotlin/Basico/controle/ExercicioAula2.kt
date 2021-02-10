package basico.controle

import basico.lista
import java.util.*

fun main() {
//    println(whileNumeros())
//    ex2()
//    ex3()
//    ex4()
//    ex5()
    ex6()
}

// 1) Crie um programa que faca a leitura de cinco numeros, mas voce deve escrever por extenso. No final mostrar o numero do lado. Ex:
// 1 - um
//2 - dois
//3 - tres
//4 - quatro
//5 - cinco

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

// 2) Faca um programa para ler uma quantidade e seguir ler esta quantidade de numeros. Depois de ler todos os  numeros, o algoritmo
// deve apresentar na tela o maior dos numeros lidos e a media dos numeros lidos. Use funcoes

fun ex2() {
    println("Digite um numero que representa a quantidade de numeros a serem inseridos na lista")
    val numeroItems: Int = readLine()!!.toInt()

    val listaNumeros: MutableList<Double> = mutableListOf()
    var i: Int = 0
    var soma: Double = 0.0

    while (i < numeroItems) {
        val numero: Double
        println("Digite o numero a ser adicionado a lista")
        numero = readLine()!!.toDouble()
        listaNumeros.add(numero)
        soma += numero

        i += 1
    }

    // outra solucao:
//    for (i in 0 until numeroItems) {
//    val numero: Double
//        println("Digite o numero a ser adicionado a lista")
//        numero = readLine()!!.toDouble()
//        listaNumeros.add(numero)
//      }

//      para calculo da media: listaNumeros.average()
//    para verificar maior numero: listaNumeros.maxOrNull()

    val maiorNumero: Double = listaNumeros.max() ?: 0.0
    val mediaNumeros: Double = soma / numeroItems

    println("O maior numero dentre os digitados e o $maiorNumero e a media de todos os numeros inseridos e de $mediaNumeros")
}

// 3) Faca um programa para ler o preco de 10 produtos ou o quanto achar necessario (while), calcular e escrever:
//- o maior preco lido
//- a media dos precos dos produtos
//Use funcoes


fun ex3() {
    println("Digite a quantidade de produtos a serem cadastrados")
    val numeroItems: Int = readLine()!!.toInt() ?: 10
    var i: Int = 0
    val listaNumeros: MutableList<Double> = mutableListOf()
    var soma: Double = 0.0

    while ( i < numeroItems) {
        val numero: Double

        println("Digite o preco do produto n${i + 1}")
        numero = readLine()!!.toDouble()
        listaNumeros.add(numero)
        soma += numero

        i += 1
    }

    var media: Double = soma / numeroItems
    var maiorPreco: Double? = listaNumeros.max() ?: 0.0

    if (maiorPreco == 0.0) {
        println("Array vazio")
    }

    println("Dentre os produtos cadastrados, aquele de maior preco custa $maiorPreco e a media total dos precos e de $media")

}

// 4) Faca um programa para iterar ate 300 com step 10, mostre a iteracao na tela, mas quando chegar em 290 dar um break e depois
// informar que nao foi possivel chegar ate 300 na iteracao

fun ex4() {
//    var i: Int = 0

    for (i in 0..300 step 10) {
        if (i == 290) {
            println("Nao foi possivel chegar ate 300 na iteracao")
            break
        }
        println("Numero $i")
    }
}

// 5) Idem 4

// 6) Faca um programa ler o nome de um aluno, sua idade, e duas notas. No final, mostre os dados, faca um do-while para o exercicio.

fun ex6() {
    val nomeAlunos: MutableList<String> = mutableListOf()
    val idadeAlunos: MutableList<Int> = mutableListOf()
    val nota1Alunos: MutableList<Double> = mutableListOf()
    val nota2Alunos: MutableList<Double> = mutableListOf()
    var i: Int = 0
    var j: Int = 0

    println("Digite a quantidade de alunos a serem registrados")
    val numeroAlunos: Int = readLine()!!.toInt()

    while (i < numeroAlunos) {
        println("Digite o nome do aluno")
        nomeAlunos.add(readLine()!!.toString())
        println("Digite a idade do aluno")
        idadeAlunos.add(readLine()!!.toInt())
        println("Digite a primeira nota do aluno")
        nota1Alunos.add(readLine()!!.toDouble())
        println("Digite a segunda nota do aluno")
        nota2Alunos.add(readLine()!!.toDouble())

        i += 1
    }

    do {
        println("O aluno ${nomeAlunos[j]}, tem ${idadeAlunos[j]} anos e suas notas foram: ${nota1Alunos[j]} e ${nota2Alunos[j]}")
        j += 1
    } while (j < numeroAlunos)

}
