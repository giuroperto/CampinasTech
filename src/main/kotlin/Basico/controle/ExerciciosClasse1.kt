package basico.controle

import basico.lista
import java.util.*

// 1) Ler um valor e escrever se e positivo ou negativo (considere o valor zero como positivo). Usar funcao

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

// ---------------------------------------------------------------------------------------

// 2) Ler um valor e escrever a mensagem "e maior que 10!" se o valor lido for maior que 10, caso contrario escrever "nao e maior que 10!"
// verificar se o valor e nulo e informar


// tem que informar tambem que a funcao pode aceitar um null
fun ifElseNullSafe(num: Int?): String {
    val response: Int = num ?: 0
    return if (response > 10) "e maior que 10!" else "nao e maior que 10!"

    //outras solucoes
    // if (x == null) {} else if(x<10) {} else {}

    // declara que a variavel aceita null no main
    // val x: Int?
}

// ---------------------------------------------------------------------------------------

// 3) Verificar  tipo de Nota do Aluno, se for informado a nota 10 uma frase deve ser mostrada: "Otimo, excelente nota, passou de ano",
// se informado nota 9, frase: "Boa nota, passou de ano", se informado nota 8, frase: "Passou de ano". Se informado diferente dessas notas, ou seja,
// (10, 9, 8) deve informar "Nota nao esperada, nao passou". Usar funcao e o when.

fun verificarNota(nota: Int?): String {

    val response: String

    when (nota) {
        10 -> response = "Otimo, excelente nota, passou de ano!"
        9 -> response = "Boa nota, passou de ano"
        8 -> response = "Passou de ano"
        else -> response = "Nota nao esperada, nao passou"
    }
    return response
}

// ---------------------------------------------------------------------------------------

// 4) Verificar se a pessoa e maior de 18 anos, se for, informar "Pode dirigir", senao "nao pode dirigir". Verificar com operacao ternaria
// se a pessoa e habilitada -> pessoa e habilitada se tiver uma mensagem qualquer  como parametro -> caso nao tenha mensagem, usar o default.
// Mostrar a mensagem "em liberacao", se for informado Null no campo de mensagem, deve por default informar "habilitacao nao autorizada".
// Criar uma funcao e entrada de parametros pelo teclado para esse exercicio.

fun habilitado(idade: Int, mensagem: String? = "Em liberacao"): String {
    var habilitada: Boolean
    var response: String

    if (idade >= 18) response = "Pode dirigir" else response = "Nao pode dirigir"

    if (mensagem == null) return "Habilitacao nao autorizada"
    // ao inves dessa da pra criar uma variavel ex liberacao = mensagem ?: "Habilitacao nao autorizada"

    if (mensagem === "Em liberacao") habilitada = false else habilitada = true

    if (habilitada) return response else return "Pessoa nao habilitada"

    //outra forma
    // var liberacao = mensagem ?: "Nao habilitado"
    // val resultado = if (idade >= 18) {
    // println("Pode dirigir")
    // }else{
    // println("Nao pode dirigir")
    // }
//    return "$resultado $liberacao"
}

// ---------------------------------------------------------------------------------------

// 5) Crie uma lista e informe numeros nela. Verificar se a primeira posicao e maior que a ultima posicao, escrever na tela.
// Ou se a segunda posicao e maior que a primeira, escrever na tela. Use funcoes

fun checkNumber(): String {
    var listaNumeros: MutableList<Int> = mutableListOf()
    var numero: Int? = 0
    var mensagem: String?

    println("Digite um numero")
    numero = Scanner(System.`in`).nextInt()
//    numero = null
    listaNumeros.add(numero)
    println("Digite outro numero")
    numero = Scanner(System.`in`).nextInt()
    listaNumeros.add(numero)
    println("Digite outro numero")
    numero = Scanner(System.`in`).nextInt()
    listaNumeros.add(numero)
    println("Digite outro numero")
    numero = Scanner(System.`in`).nextInt()
    listaNumeros.add(numero)
    println("Digite outro numero")
    numero = Scanner(System.`in`).nextInt()
    listaNumeros.add(numero)

    if (listaNumeros[0] > listaNumeros[4]) mensagem = "Primeiro numero maior do que ultimo numero" else if (listaNumeros[1] > listaNumeros[0]) mensagem = "Segundo numero maior que o primeiro" else mensagem = null

    if (mensagem == null) mensagem = "A mensagem e nula"
    return mensagem
}

// ---------------------------------------------------------------------------------------

fun main() {
    var num: Int = 0


//    positivoNegativo(num)

//    println("Digite um valor")
//    println(ifElseNullSafe(Scanner(System.`in`).nextInt()))

//    println("Digite a nota")
//    val nota: Int?  = Scanner(System.`in`).nextInt()
//    println(verificarNota(nota))
//    println(verificarNota(null))

    println("Digite a idade do condutor")
    var idade: Int = Scanner(System.`in`).nextInt()
    println("Digite se o condutor esta habilitado")
    var mensagem: String? = Scanner(System.`in`).nextLine()

//    println(habilitado(19, null))
//    println(habilitado(idade, mensagem))
//    println(habilitado(idade))

//    println(checkNumber())
}