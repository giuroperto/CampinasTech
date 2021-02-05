package basico

// pointer nao encontra valor especifico dentro do programa
// null safety -> processo dentro do kotlin para tratar as excecoes de null pointer
// safe call operator -?

// usado para garantir que nao teremos problemas com NullPointer
var a: Int ? = null
// com a interrogacao pode receber valor nulo -> pega valor nulo e pode tratar
// sem interrogacao nao pode receber valor nulo

// a.dec() -> erro
// a?.dec()
//vai chiar pois tem o null safety -> variavel tbm tem que ter esse operador para ser executada

// vazio diferente de null -> pode ser preenchido e nao tem nada dentro
// null eh sem nada, vazio

fun main() {
    val opcional: String? = null

    // se vier um cara nulo, coloque esse valor -> valor padrao
    // operador elvis
    val obrigatorio: String = opcional ?: "Valor Padrao"


    var valor: Int? = null
    // passa o null
    println(valor?.inc())

    // nao vai deixar passar o null -> forcando a jogar o erro
    // isso que vai acontecer na app se nao tratar pelo null pointer
    println(valor!!.inc())
}