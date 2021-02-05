package basico.operadores

import java.util.*

fun main() {
//    importa a classe scanner para o projeto -> System -> in (que e palavra reservada no kotlin e por isso ele coloca entre crases)
    // variavel para ler os valores -> scaneia a info do sistema
    val leitura = Scanner(System.`in`);
    println("Digite um valor de a");
    // criei uma variavel que esta vindo no prompt -> valor inteiro
    val a: Int = leitura.nextInt();
    // o next int passa para o proximo espaco
    println("Digite um valor de b")
    val b: Int = leitura.nextInt();

    val c: Int = a + b;
    println("Digite o valor de c: "+c);
}