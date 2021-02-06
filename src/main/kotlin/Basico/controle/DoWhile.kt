package basico.controle

//import java.util.*

fun main() {
//    val leitura = Scanner(System.`in`)
    val valores: MutableList<Double> = mutableListOf()
    var opcao: String = ""

//    while (opcao != "N" && opcao != "n")
    do {

        // regra dentro do while

        println("Digite o valor que deseja: ")
        val compra = readLine()!!.toDouble()
        valores.add(compra)

        println("Continuar dentro do while? S/N")
        opcao = readLine() ?: "N"
    } while (opcao.toUpperCase() != "N")
    println(valores)
}