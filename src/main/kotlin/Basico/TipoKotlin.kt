package basico

fun main() {

    //    dois tipos de variaveis
    //    var -> no encapsulamento e getter e setter
    //    val eh so a parte do get, nao da pra setar ou alterar dados nele
    //    val e constante -> imutavel
    //    var e mutavel

    //    inferencia de tipo
        val a: Int = 1
        val b = 3
        val c = "Ola"

    //    para retornar o que esta na posicao
        println(c.get(1))

        println(a + b)

    //    tipos em Kotlin
    val num3: Byte = 127 // maxvalue
    val num4: Short = 32767 // maxvalue
    val num1: Int = 2147483647 // tamanho de bites que o algoritmo inteiro comporta
    val num2: Long = 9223372036854775807 // max value
    //    em Kotlin pode se separar os numeros assim 2_147_483_647
    val num5: Double = 3.143423423423423423423423423423423423423444444444444444444333333333333333333322222222222222222444444444444444444444444444444444222222222222333333333333333333333333333333333333333333333333333333
    val num6: Float = 3.14f // muito parecido com double, mas maior, e tem que ter o f no final
    val num7: Char = 'A' // suporta so um caractere
    val num8: Boolean = true // por default e sempre false
    val num9: String = "" // como char mas suporta mais caracteres

    val num10: Any // pode ser qualquer coisa/qualquer tipo -> perigoso pois pode incorrer em erros nao previsiveis

    println(2 is Int) // para fazer validacao de tipo em Kotlin is
    println(num1.dec()) // decrementar


}

