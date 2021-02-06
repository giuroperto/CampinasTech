package basico

fun main() {
//    funcoes tem dependencia mt forte em java, diferente de kotlin - metodo nao sobrevive sem classe no java
//    funcoes -> metodos

//    classe agregacao metodo


    soma(3, 5);
    soma2(3);
    println(multiplicaDoisNumeros(1.1,3.5));
    println(multiplicacaoDoisNumeros2(1.1,3.5));
    lista();

    // argumentos/parametros nomeados
    println(nivelHierarquico(chefe = "Maria", funcionario = "Jose"))
}

//funcao sem retorno

// retorno e unit mas eh sem retorno, entao pode deixar sem, e opcional
fun soma(a: Int, b: Int): Unit {
    println("A soma de A e B e: "+ (a+b));
}

// valor default no parametro
fun soma2(a: Int, b: Int = 1) {
    println("A soma de A e B e: "+ (a+b));
}

//funcao com retorno
// colocar o tipo de retorno se nao vai dar pau
fun multiplicaDoisNumeros(a: Double, b: Double): Double {
    return a * b;
}

fun multiplicacaoDoisNumeros2(a: Double, b: Double) = a * b;

// funcao anonima -> depois

// deixa explicito que e uma funcao sem retorno com o unit, mesmo que ela printe algo
fun somaDoisNumeros(a: Int, b: Int = 1): Unit = println("A soma de A e B e: "+ (a+b));

//funcao faz alguma coisa mas nao expoe o valor, nao retorna nada
fun somaNumeros(a: Int, b: Int): Unit {
    val calculo: Int = a + b;
}


// -----------------------------------------------------------------------------------------------

//LISTAS

// generics -> define os tipos na lista
// lista<String>
// lista<Int>
// lista<Any>
// lista<Cadastro> e os objetos serem passados la dentro

fun lista() {
    // tem tamanho especifico, fica dificil manipular as infos
    // tem um outro tipo -> mutableListOf = mutavel
    // listOf = imutavel
    val compras = listOf("Arroz", "Feijao", "Carne")

    // assim da erro
//    compras[0] = "Batata";

    println(compras[0])

    // lista mutavel
    val comprasMutavel: MutableList<String> = mutableListOf("Arroz", "Feijao", "Carne")

    comprasMutavel[0] = "Melancia"

    // para adicionar na lista tipo push
    comprasMutavel.add("Peixe");

    // pode ser em branco para ir adicionando aos poucos

    println(comprasMutavel);
}

fun mostraLista(compras: MutableList<String>): MutableList<String> {
    // passar valor que recebe de uma lista
    // tipo de retorno pode ser igual ou ANY
    return compras;

}

fun nivelHierarquico(funcionario: String = "Jose", chefe: String = "Claudia"): String {
    return "$funcionario e submisso(a) a $chefe"
}
