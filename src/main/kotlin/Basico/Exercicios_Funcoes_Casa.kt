package basico

// 1) Crie uma lista e faca com que ela mostre os valores ao contrario. Exemplo:
// ENTRADA huelton, carlos, jose
// SAIDA jose, carlos, huelton

fun ex1(): List<String> {
    val list = listOf("huelton", "carlos", "jose", "giulia")

    val reversed = list.reversed()

    return reversed
}

// 2) Faca uma funcao que recebe 4 notas e mostre a media do aluno na tela:
// A media do aluno e:
// Use funcao e lista para poder criar o arquivo

// 3) Crie um arquivo que contenha funcoes com as operacoes matematicas: soma, subtracao, multiplicacao e modulo
// O usuario deve informar 2 numeros e fazer os calculos de cada operacao
// Use template string e crie funcoes para isso -> Mostre resultado na tela

// 4) Crie uma lista mutavel de produtos, adicione valores nela e mostre no final:
// Quantidade de produto, nome do produto, e o valor do produto vezes a quantidade
// Use Scanner e mutableListOf, verifique a necessidade de criar umas funcoes no processo

// nao consegue fazer a multiplicacao de dois numeros em uma lista -> funcao para multiplicar

// 5) Crie 1 funcao que recebe os valores da lista e mostre conforme o enunciado do primeiro exercicio
// Verifique a necessidade de criar funcoes no processo


fun main() {
    println(ex1())

}