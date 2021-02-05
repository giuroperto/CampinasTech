package basico

import java.util.*
import kotlin.math.pow

// 1) Criar uma funcao sem retorno que mostre a soma de 2 numeros, multiplicado pelo primeiro parametro e dividido pelo segundo parametro
// com a mensagem "A soma/multiplicacao e divisao do resultado e: "

fun ex1(a:  Int, b: Int) {
    val sum: Int = a + b;
    val result: Int = (sum * a) / b

    println("A soma/multiplicacao e divisao do resultado e:"+result)

}

// 2) Criar uma funcao com retorno que mostre o tamanho da palavra digitada: use a funcao length para mostrar o tamanho da String

fun ex2(): Int {
    val leitura = Scanner(System.`in`);
    println("Digite uma string");
    val response: String = leitura.nextLine();

    return response.length;
}

// 3) Crie uma funcao sem retorno de multiplicar com parametro default, caso eu nao informe o parametro, deve ocorrer a multiplicacao pelo numero 3

fun ex3(a: Int = 3) {
    println("Digite um valor")
    val leitor = Scanner(System.`in`)

    val mult: Int = leitor.nextInt() * a

    println(mult)
}

// 4) Crie uma funcao com retorno que realiza o calculo de um circulo: A = pi & r2. Onde pi: constante Pi(3,14) e r = raio

fun ex4(raio: Double): Double {
    val A: Double = kotlin.math.PI * raio.pow(2)
    return A
}

// 5) Crie uma template String que mostre os valores invertidos de um nome passado pela funcao, exemplo: Informei 'Huelton, Carlos', e deve retornar
// "Lista de Pessoas sao: [Carlos, Huelton]"

fun ex5(n1: String, n2: String): String {
    val response: String = "Lista de Pessoas sao: [$n2, $n1]"

    return response
}

// 6) Crie uma template string que mostre a segunda nota de um aluno, pode usar listOf. Digite o nome e as notas do aluno.

fun ex6() {
    var array: MutableList<Double> = mutableListOf()

    println("Digite o nome do aluno")
    val nome: String = Scanner(System.`in`).nextLine()
    println("Digite a 1a nota do aluno")
    array.add(Scanner(System.`in`).nextDouble())
    println("Digite a 2a nota do aluno")
    array.add(Scanner(System.`in`).nextDouble())
    println("Digite a 3a nota do aluno")
    array.add(Scanner(System.`in`).nextDouble())
    println("Digite a 4a nota do aluno")
    array.add(Scanner(System.`in`).nextDouble())

    println("Aluno: $nome")
    println("Nota 2: ${array[1]}")
}

// 7) Crie uma template String que ao digitar o nome de uma pessoa, ele mostre o ultimo caractere. Use a funcao para elevar o nivel

fun ex7(): String {
    println("Digite o nome:")
    val nome: String = Scanner(System.`in`).nextLine()

    return "O nome e $nome e o ultimo caractere dele e ${nome[(nome.length) - 1]}"
}

// 8) Crie uma template string que ao digitar um nome, ele mostre todos os caracteres em maiusculo. Exemplo: Entrada: 'huelton', Saida: 'HUELTON'
// verifique qual funcao podemos fazer isso. Use funcao tambem para elevar o nivel com parametro default.

fun ex8(nome: String = "Alfredo"): String {
    return nome.toUpperCase()
}


fun main() {
//    ex1(10,5)
//    println(ex2());
//    ex3(10)
//    println(ex4(2.0))
//    println(ex5("Giulia", "Henrique"))
//    ex6()
//    println(ex7())

    println("Digite o nome:")
    val nome: String = Scanner(System.`in`).nextLine()
    println(ex8(nome))
    println(ex8())
}