
fun pegaUmNumDoUsuario(posicaoDoNum: String): Int {
    print("Digite o $posicaoDoNum numero inteiro e aperte enter: ")
    return readln().toInt()
}

fun soma(primeiroNum: Int, segundoNum: Int): Int {
    return primeiroNum + segundoNum
}

fun imprimeResultado(resultado: Int, nomeDaOperacao: String) {
    println("\n **** O resultado da operação de $nomeDaOperacao é: $resultado ****")
}

fun subtrai(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun multiplica(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun divide(num1: Int, num2: Int): Int {
    return num1 / num2
}

fun restoDaDivisao(num1: Int, num2: Int): Int {
    return num1 % num2
}

//Exercicio da pretinha
//Fazer um programa que faça a operação da seguinte equação (A+B+C-D)*E