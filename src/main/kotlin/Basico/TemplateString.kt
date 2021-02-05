package basico

fun main() {
    val nome = "Giulia"
    val aprovados = listOf("Jose", "Claudia", "Pedro")

    println("Ola $nome, usando Template String")
    // para pegar posicao dentro de uma lista
    println("O primeiro colocado e: ${aprovados[0]}")

    // antigamente template string era ${} e agora pode ser so o $variavel

    // decrementando o valor
    // passar funcoes para um numero
    var a: Int = 356.dec()
    // convertendo valor pra String
    var b: String = a.toString()

    // separa a string para verificar a variavel
    println("Int: $a")
    println("Primeiro caracter da String e: ${b.first()}")
    println("Primeiro caracter da String e: ${b.last()}")
}