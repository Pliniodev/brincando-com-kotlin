package Sofrendocomkotlin

fun main() {
    usandoIf(2)
}

fun usandoIf(num: Int) {
    println("Função: usandoIf")
    /**
     * Sintaxe
     * se(condição) {
     *      faça isso
     * } senão se (outraCondição) {
     *      faça isso
     * } senão {
     *      faça isso
     * }
     */
    //% divide e retorna o resto da divisão
    //+ soma
    //- subtrai
    //* multiplica
    //condicionais
    //&& só da o resultado true se as duas coisas forem verdadeira
    // || se uma das proposições for verdadeira então é true
    // ! -> not inverso do resultado
    //se um numero(Num) / 2 tiver o resto 0 faça algo
    if ((num % 2) == 0) {
        println("O número $num é divisível por 2")
    }else if ((num % 3) == 0){
        println("O número $num é divisível por três")
    }else {
        println("não é divisível nem por 2 nem por 3")
    }
}

fun somei() {
    println("Digite um numero")
    val primeironumero = readln().toInt()
    println("Digite outro numero")
    val segundonumero = readln().toInt()

    val somado = primeironumero + segundonumero
    println("O resultado é $somado")
}

fun vezes() {
    println("Digite um numero")
    val x = readln().toInt()
    println("Digite outro numero")
    val y = readln().toInt()

    val multiplica = x * y
    println("O resultado é $multiplica")
}

fun divisao() {
    println("digite um numero")
    val x = readln().toInt()
    println("Digite outro numero")
    val y = readln().toInt()

    val divide = x / y
    println("O resultado é $divide")

}

fun expressao() {
    println("Digite um numero")
    val x = readln().toInt()
    println("Digite outro numero")
    val y = readln().toInt()

    val resultado = 2 * (x + y) - 1
    println("O resultado é $resultado")
}