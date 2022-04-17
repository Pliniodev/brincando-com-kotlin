fun main(){
    val num1 = pegaUmNumDoUsuario(posicaoDoNum = "primeiro")// aqui estamos nomeando o parâmetro
    val num2 = pegaUmNumDoUsuario("segundo")
    val resultado = soma(num1, num2)
    imprimeResultado(resultado, "Soma")
}

fun pegaUmNumDoUsuario(posicaoDoNum: String): Int {
    print("Digite o $posicaoDoNum numero inteiro e aperte enter: ")
    return readln().toInt()
}

fun soma(num1: Int, num2: Int): Int {
    return num1 + num2
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

fun imprimeResultado(resultado: Int, nomeDaOperacao: String) {
    println("\n **** O resultado da operação de $nomeDaOperacao é: $resultado ****")
}