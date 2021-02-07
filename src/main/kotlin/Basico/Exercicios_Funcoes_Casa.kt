package basico

import java.util.*

// 1) Crie uma lista e faca com que ela mostre os valores ao contrario. Exemplo:
// ENTRADA huelton, carlos, jose
// SAIDA jose, carlos, huelton

fun ex1(): List<String> {
    val list = listOf("huelton", "carlos", "jose", "giulia")

    val reversed = list.reversed()

    return reversed
}

// 2) Faca uma funcao que recebe 4 notas e mostre a media do aluno na tela:
// A media do aluno e:
// Use funcao e lista para poder criar o arquivo

fun ex2(lista: MutableList<Double>): String {
    val somaNotas: Double = lista[0] + lista[1] + lista[2] + lista[3]
    val media: Double = somaNotas / 4

    return ("As notas do aluno foram ${lista[0]} , ${lista[1]}, ${lista[2]} e ${lista[3]} e a media e de $media")

}

// 3) Crie um arquivo que contenha funcoes com as operacoes matematicas: soma, subtracao, multiplicacao e modulo
// O usuario deve informar 2 numeros e fazer os calculos de cada operacao
// Use template string e crie funcoes para isso -> Mostre resultado na tela

fun ex3(): String {
    println("Insira o primeiro valor")
    val n1: Double = readLine()!!.toDouble()
    println("Insira o segundo valor")
    val n2: Double = readLine()!!.toDouble()

    val somarNumeros: Double = somar(n1, n2)
    val subtrairNumeros: Double = subt(n1, n2)
    val multiplicarNumeros: Double = mult(n1, n2)
    val moduloNumeros: Double = module(n1, n2)

    return ("Os numeros sao: $n1 e $n2. O resultado da soma = $somarNumeros, o resultado da subtracao e $subtrairNumeros, o resultado da multiplicacao e $multiplicarNumeros e o resultado do modulo e $moduloNumeros")
}

fun somar(a: Double, b: Double): Double {
    return a + b
}

fun mult(a: Double, b: Double): Double {
    return a * b
}

fun subt(a: Double, b: Double): Double {
    return a - b
}

fun module(a: Double, b: Double): Double {
    return a % b
}

// 4) Crie uma lista mutavel de produtos, adicione valores nela e mostre no final:
// Quantidade de produto, nome do produto, e o valor do produto vezes a quantidade
// Use Scanner e mutableListOf, verifique a necessidade de criar umas funcoes no processo

fun ex4(): String {
    // tamanho da lista e com .size
    val listaQuantidade: MutableList<Int> = mutableListOf()
    val listaProduto: MutableList<String> = mutableListOf()
    val listaValor: MutableList<Double> = mutableListOf()

    println("Digite o nome do produto")
    listaProduto.add(readLine()!!.toString())
    println("Digite a quantidade do produto")
    listaQuantidade.add(readLine()!!.toInt())
    println("Digite o valor total do produto")
    listaValor.add(readLine()!!.toDouble())

    return ("Foi adicionado ao carrinho o produto ${listaProduto[0]}, no total de ${listaQuantidade[0]} e com o valor total de ${multiplicar(listaQuantidade[0], listaValor[0])}")

    // outra solucao
//    val compras: MutableList<Any> = mutableListOf()
//    val leitura = Scanner(System.`in`)
//
//    println("Digite o nome do produto")
//    val produto: String = leitura.nextLine()
//    compras.add(produto)
//    println("Digite a quantidade do produto")
//    val quantidade: Int = leitura.nextInt()
//    compras.add(quantidade)
//    println("Digite o valor do produto")
//    val valor: Double = leitura.nextDouble()
//    compras.add(valor)
//
//    println("Nome do produto" + compras[0] + " Quantidade: " + compras[1] + " Valor Unitario: "
//            + compras[2] + " Valor Total: " + multiplicar(quantidade, valor))
    // funcao de multiplicar tem que ser multiplicaCompra(compras[1].toString(), compras[2].toString())
}

fun multiplicar(a: Int, b: Double): Double {
    return a * b
}

// outra forma de fazer essa formula
//fun multiplicaCompra(x: String, y: String): Any = x.toDouble() * y.toDouble()

// nao consegue fazer a multiplicacao de dois numeros em uma lista -> funcao para multiplicar

// 5) Crie 1 funcao que recebe os valores da lista e mostre conforme o enunciado do primeiro exercicio
// Verifique a necessidade de criar funcoes no processo

fun ex5(lista: MutableList<Any>): List<Any> {
    return lista.reversed()
}




fun main() {
//    println(ex1())

//    val listaNumeros: MutableList<Double> = mutableListOf()
//
//    println("Digite a primeira nota")
//    listaNumeros.add(readLine()!!.toDouble())
//    println("Digite a segunda nota")
//    listaNumeros.add(readLine()!!.toDouble())
//    println("Digite a terceira nota")
//    listaNumeros.add(readLine()!!.toDouble())
//    println("Digite a quarta nota")
//    listaNumeros.add(readLine()!!.toDouble())
//
//    println(ex2(listaNumeros))

//    println(ex3())

      println(ex4())

//    val lista: MutableList<Any> = mutableListOf("Arroz", "Feijao", "Farofa", "Macarrao")
//    println(ex5(lista))

}