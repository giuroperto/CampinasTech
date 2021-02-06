package basico.controle

import java.util.*

// 1) Ler as notas da 1a e 2a avaliacoes de um aluno. Calcular a media aritmetica simples e escrever uma mensagem que diga
// se o aluno foi ou nao aprovado (considerar que nota igual ou maior que 6 o aluno e aprovado). Escrever tambem a media calculada. Use funcao.

fun ex1(): String {

    println("Digite o nome do aluno")
    var nome: String = Scanner(System.`in`).nextLine()
    println("Digite a primeira nota")
    var n1: Int = Scanner(System.`in`).nextInt()
    println("Digite a segunda nota")
    var n2: Int = Scanner(System.`in`).nextInt()

    var media = (n1 + n2) / 2

    var mensagem: String

    if (media >= 6) mensagem = "Aprovado" else mensagem = "Reprovado"

    return "$mensagem. A media do aluno e $media."
}

// 2) A jornada de trabalho semanal de um funcionario e de 40h. O funcionario que trabalhar mais de 40h recebera hora extra, cujo calculo
// e o valor da hora regular com um acrescimo de 50%. Escreva um programa que leia o numero de horas trabalhadas em um mes,
// o salario por hora e escreva o salario total do funcionario, que devera ser acrescido das horas extras, caso tenham sido trabalhadas
// (considere que o mes possua 4 semanas exatas). Use funcao

fun ex2(horas: Double, valorHora: Double): Double {

    val horasExtras: Double = horas % 40
    val valorExtra: Double = horasExtras * (1.5 * valorHora)
    val valorTotal: Double = valorHora * 40 + valorExtra

    return valorTotal
}

// 3) Um posto XELL esta vendendo combustiveis com a seguinte tabela de descontos:
// alcool
// ate 20L, desconto de 3% por L
// acima de 20L, desconto de 5% por L
// gasolina
// ate 20L, desconto de 4% por litro
// acima de 20L, desconto de 6% por litro

//Escreva um programa que leia o numero de litros vendidos e o tipo de combustivel (codificando da seguinte forma:
// A-alcool, G-gasolina). Calcule e imprima o valor a ser pago pelo cliente, sabendo-se que o preco do litro da gasolina e R$4,60
// e o preco do litro do alcool e R$3,20. Use funcao e um layout bonito para o funcionario que esta calculando o valor. Use funcao.

fun ex3(litros: Double, tipoCombustivel: String): Double {

    val valorTotal: Double
    val precoGasolina: Double = 4.6
    val precoAlcool: Double = 3.2

    if (tipoCombustivel.toUpperCase() == "A") {
        if (litros <= 20) {
            valorTotal = 0.97 * litros
        } else {
            valorTotal = 0.95 * litros
        }
    } else if (tipoCombustivel.toUpperCase() == "G") {
        if (litros <= 20) {
            valorTotal = 0.96 * litros
        } else {
            valorTotal = 0.94 * litros
        }
    } else {
        return -1.0
    }

    return valorTotal
}

// 4) Uma mercearia esta vendendo frutas com a seguinte tabela de precos:
// morango - ate 5kg: R$ 5,50/kg - acima de 5kg: R$5,20/kg
// maca - ate 5kg: R$3,80/kg - acima de 5kg: R$3,50/kg
// Se o cliente comprar mais de 8kg em frutas ou o valor total da compra ultrapassar R$25,00 , recebera ainda um desconto de 10% sobre este total.
// Escreva um programa para ler a quantidade (em kg) de morangos e a quantidade (em kg) de macas adquirdas, e escreva o valor a ser pago
// pelo cliente. Use funcao.

fun ex4(kgMorango: Double, kgMaca: Double ): Double {
    var totalSemDesconto: Double
    var precoMorango: Double?
    var precoMaca: Double?

    if (kgMorango <= 5) {
        precoMorango = 5.5
    } else {
        precoMorango = 5.2
    }

    if (kgMaca <= 5) {
        precoMaca = 3.8
    } else {
        precoMaca = 3.5
    }

    totalSemDesconto = kgMorango * precoMorango + kgMaca * precoMaca

    if (kgMaca + kgMorango > 8 || totalSemDesconto > 25) totalSemDesconto *= 0.9

    return totalSemDesconto

}


fun main() {
//    println(ex1())

//    println("Digite o numero de horas trabalhadas")
//    val horasTrabalhadas: Double = Scanner(System.`in`).nextDouble()
//    println("Digite o salario por hora")
//    val valorHora: Double = Scanner(System.`in`).nextDouble()
//    println(ex2(horasTrabalhadas, valorHora))
//
//    println("-------------------------------------------")
//    println("-------------------------------------------")
//    println("----------------POSTOS XELL----------------")
//    println("-------------------------------------------")
//    println("-------------------------------------------")
//    println("Digite o tipo de combustivel")
//    val tipoComb: String = Scanner(System.`in`).nextLine()
//    println("-------------------------------------------")
//    println("Perfeito. Agora digite quantos litros de $tipoComb foi abastecido")
//    val litrosComb: Double = Scanner(System.`in`).nextDouble()
//    println("-------------------------------------------")
//    println("Abastecendo $litrosComb LITROS de $tipoComb. Valor total:")
//    val response: Double = ex3(litrosComb, tipoComb)
//    if (response > 0) {
//        println("O preco total a ser pago pelo cliente e de R$ $response")
//    } else {
//        println("Tipo de combustivel nao identificado")
//    }

    val qtdMorangos: Double
    val qtdMacas: Double
    println("Digite a quantidade de morangos")
    qtdMorangos = readLine()!!.toDouble()
    println("Digite a quantidade de macas")
    qtdMacas = readLine()!!.toDouble()

    println(ex4(qtdMorangos, qtdMacas))
}