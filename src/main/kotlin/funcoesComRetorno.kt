/**
 * Pra que exista uma organização do código, usamos um conceito que diz que uma função
 * só deve fazer uma coisa, não é uma boa prática escrever uma função muito longa
 * que faça várias coisas. O ideal é que usemos várias funções, cada uma com sua
 * responsabilidade, abaixo um exemplo.
 */

fun usandoAsDuasFuncoes() {
    val retornoDafuncaoDeSoma = retornaASomaDeDoisNumeros()

    val retornoDeOutraFuncao = retornaOProdutoDeDoisNumeros()

    val somaDoRetornoDeDuasFuncoes = retornoDafuncaoDeSoma + retornoDeOutraFuncao
    println("A soma dos dois resultados é: $somaDoRetornoDeDuasFuncoes")
}

fun retornaASomaDeDoisNumeros(): Int {
    println("Iniciando soma")
    println("Digite um numero inteiro e aperte enter")
    val num1 = readln().toInt()
    println("Digite outro numero inteiro e aperte enter")
    val num2 = readln().toInt()
    val resultadoDaSoma = num1 + num2
    println("O resultado da soma é $resultadoDaSoma, o primeiro numero é $num1 e o segundo é o $num2")

    return resultadoDaSoma
}

fun retornaOProdutoDeDoisNumeros(): Int {
    println("Iniciando multiplicação")
    println("Digite um numero inteiro e aperte enter")
    val num1 = readln().toInt()
    println("Digite outro numero inteiro e aperte enter")
    val num2 = readln().toInt()
    val produtoDaMultiplicacao = num1 * num2
    println("O resultado da multiplicação é $produtoDaMultiplicacao")

    return produtoDaMultiplicacao
}

