package basico.operadores

// criar variaveis de tipo Boolean usando o operador && deve retornar "true"

fun main() {
    val a: Boolean = true
    val b: Boolean = false
    val c: Boolean = a && b // true + false = false
    val d: Boolean = b && c // false + false = false
    val e: Boolean = a && d // true + false = false
    val f: Boolean = true
    val g: Boolean = a && f // true + true = true

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
}