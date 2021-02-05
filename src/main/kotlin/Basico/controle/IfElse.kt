package basico.controle

fun main() {
    val nota: Double = 6.0

    val result = if (nota >= 7.0) {
        ("Passou!!!")
    } else {
        ("Reprovou!!!")
    }

    // outra forma de escrever

//     val resultado = if (nota >= 7.0) "Passou!" else "Reprovou!"
     val resultado = if (nota >= 7.0) "Passou!" else if (nota >= 5 && nota < 7) "Recuperacao!" else "Reprovou!"

    println(result)

    // mais uma forma
    println(obterResultado(nota))

    // de 9.0 a 10.0 -> range
    //val nota: Double = 4.0
    if(nota in 9.0..10.0) {
        println("Otima nota")
    } else if(nota in 7.0..8.9) {
        println("Boa nota")
    } else if(nota in 4.0..6.9) {
        println("Recuperacao")
    } else if(nota in 0.0..3.99){
        println("Reprovado")
    } else {
        println("Nota invalida")
    }

    // sintaxe when -> ao inves de fazer esse processo acima -> switch
    // daria para usar com o in tbm
    // in 10.0..9.0
    when(nota) {
        10.0, 9.0 -> println("Otima nota")
        8.99,7.0 -> println("Boa nota")
        6.99,4.0 -> println("Recuperacao")
        3.99, 0.0 -> println("Reprovado")
        else -> println("Nota invalida")
    }
}

fun obterResultado(nota :Double): String = if (nota >= 7.0) "Passou!" else if (nota >= 5 && nota < 7) "Recuperacao!" else "Reprovou!"

// coloca a condicao dentro de uma variavel -> retorno sabe que so pode ser uma string

// para verificar se a nota esta nula
// nota null eh que nao tem no sistema
// agora se pode zerar a nota porque o aluno nao fez -> eh diferente
// null nao pode ser -> tem que ser tratado -> nao conversa com inteiro e nem com o double -> como faz o calculo?
// ex banco -> se algo retornar nulo pode dar erro -> tem que tratar
fun calculoNotas(nota: Double?) {

}

fun if_template() {
    val sentimento = true

    // template string com if/else
    println("Hoje estou ${ if(sentimento) "Alegre" else "Triste" } ")

    // tambem da pra colocar com else if
//    println("Hoje estou ${ if(sentimento) "Alegre" else if(outracondicao) "Triste" } ")
}


