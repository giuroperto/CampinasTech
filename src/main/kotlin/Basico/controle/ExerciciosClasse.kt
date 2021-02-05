package basico.controle

import java.util.*

fun main() {
    var num: Int = 0

    // 1) Ler um valor e escrever se e positivo ou negativo (considere o valor zero como positivo). Usar funcao
//    positivoNegativo(num)

    // ---------------------------------------------------------------------------------------

    // 2) Ler um valor e escrever a mensagem "e maior que 10!" se o valor lido for maior que 10, caso contrario escrever "nao e maior que 10!"
    // verificar se o valor e nulo e informar

//    println("Digite um valor")
//    println(ifElseNullSafe(Scanner(System.`in`).nextInt()))

    // outras solucoes
    // declara que a variavel aceita null
    // val x: Int?

    // ---------------------------------------------------------------------------------------

    // 3) Verificar  tipo de Nota do Aluno, se for informado a nota 10 uma frase deve ser mostrada: "Otimo, excelente nota, passou de ano",
    // se informado nota 9, frase: "Boa nota, passou de ano", se informado nota 8, frase: "Passou de ano". Se informado diferente dessas notas, ou seja,
    // (10, 9, 8) deve informar "Nota nao esperada, nao passou". Usar funcao e o when.

//    val nota: Int?  = Scanner(System.`in`).nextIn()
//    println(verificarNota(nota))

}

fun positivoNegativo(num: Int) {
    val response: String = if (num >= 0) "Positivo" else "Negativo"
    println(response)

    // outras solucoes
    // val leitor = Scanner(System.`in`)
    // println("Digite um valor")

    // next int pega o valor que esta vindo do leitor e atribui a variavel
    // val valor = leitor.nextInt()
    // if (valor >= 0) "Positivo" else "Negativo"

    // para usar como parametro da funcao
    // println(negative(Scanner(System.`in`).nextInt())
}

// tem que informar tambem que a funcao pode aceitar um null
fun ifElseNullSafe(num: Int?): String {
    val response: Int = num ?: 0
    return if (response > 10) "e maior que 10!" else "nao e maior que 10!"

    //outras solucoes
    // if (x == null) {} else if(x<10) {} else {}
}

//fun verificarNota(nota: Int?): String {
//    when (nota) {
//        10 -> "Otimo, excelente nota, passou de ano!"
//    }
//}