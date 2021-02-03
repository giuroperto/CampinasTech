package basico.operadores

fun ex1() {
    // 1) Crie uma variavel Any que recebe uma soma de inteiro

        val a: Int = 5;
        val b: Int = 6;
        val c: Any = a + b;

        println(c);
}

fun ex2() {
    // 2) Crie a expressao aritmetica (((32/4)*(8*5))-30) troque os numeros por variaveis

        val v1: Int = 32;
        val v2: Int = 4;
        val v3: Int = v2 * 2;
        val v4: Int = 5;
        val v5: Int = v4 * 6;
        val expressao: Int = (((v1/v2)*(v3*v4))-30);

        println(expressao);
}
fun ex3() {
    // 3) Criar 3 variaveis: chuva, molha, venta -> Caracteristicas de uma tempestade.

    val chuva: Boolean = false;
    val molha: Boolean = false;
    val venta: Boolean = true;

    // Faca uma validacao para que em XOR o valor do print seja verdadeiro

    val tempestade1: Boolean = chuva xor venta;
    println(tempestade1);

    // Faca uma validacao para que em && seja falso para tempestade

    val tempestade2: Boolean = chuva && molha;
    println(tempestade2);

    // Faca uma validacao para quem em || seja verdadeiro

    val tempestade3: Boolean = molha || venta;
    println(tempestade3);
}
fun ex4() {
    // 4) Crie uma variavel que faca a validacao: a = 3, b = 5, c = 1. A deve ser maior que b e c, mas b deve ser menor que c.
    // Mostre a expressao e o resultado na tela

    val a: Int = 3;
    val b: Int = 5;
    val c: Int = 1;
    var validacao: Boolean = false;

    validacao = a > b && a > c && b < c;
    println("Expressao: a > b && a > c && b < c");
    println(validacao);

}
fun ex5() {
    // 5) Utilize somente o tipo Char para criar seu primeiro nome

    var (c1, c2, c3) = listOf('G','i','u');
    var (c4, c5, c6) = listOf('l','i','a');

    print(c1)
    print(c2)
    print(c3)
    print(c4)
    print(c5)
    print(c6)


}



fun main() {
//    ex1();
//    ex2();
//    ex3();
//    ex4();
    ex5();
}

