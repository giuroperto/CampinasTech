package basico.controle

fun main() {

    val valores: MutableList<Double> = mutableListOf()
    var opcao: String = ""

    while (opcao.toUpperCase() != "N") {
        println("Digite o valor que deseja: ")
        val compra = readLine()!!.toDouble()
        valores.add(compra)

        println("Continuar dentro do while? S/N")
        opcao = readLine() ?: "N"
    }

//    for1(valores)
    for2()

}

//fun for1(valores) {
    // dessa forma nao precisa se preocupar com tamanho da lista
//    for(valor in valores) {
////        println(valor)
//        println("Valor do produto: ${valor}")
//        // da para inserir expressoes entre as chaves, ex ${valor > 0}
//    }
//}

fun for2() {
    for (i in 1..10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println("i = $i")
    }

    for (i in 1..30 step 5) {
        println("i = $i")
    }
}

fun for3() {
    val alunos = listOf("Huelton", "Carlos", "Jose")

    for((idx, aluno) in alunos.withIndex()) {
        println("$idx - $aluno")
    }
}

// interrompe o for so no nivel dele
fun forBreak() {
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
}

// continua o for pulando as instrucoes abaixo
fun forContinue() {
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println(i)
    }
}