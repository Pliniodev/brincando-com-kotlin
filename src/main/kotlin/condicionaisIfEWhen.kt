fun usandoEstruturasCondicionais() {
    val num = imprimeEnunciadoCondicionais()

    usandoIf(num)
    usandoWhen(num)
    usandoWhen2(num)
    usandoWhen3(num)
}

fun imprimeEnunciadoCondicionais(): Int {
    println("Digite um numero")
    return readln().toInt()
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

    if ((num % 2) == 0) {
        println("O número $num é divisível por 2")
    }else if ((num % 3) == 0){
        println("O número $num é divisível por três")
    }else {
        println("não é divisível nem por 2 nem por 3")
    }
}

fun usandoWhen(num: Int) {
    println("\nFunção: usandoWhen")
    /**
     * Sintaxe
     * quando {
     *      umaCondição -> faça isso
     *      outraCondição -> faça isso
     *      senão -> faça isso
     * }
     */
    when {
        (num % 2) == 0 && (num % 3) == 0 -> println("O número $num é divisível por 2 e por 3")
        (num % 2) == 0 -> println("O número $num é divisível por 2")
        (num % 3) == 0 -> println("O número $num é divisível por três")
        else -> println("não é divisível nem por 2 nem por 3")
    }
}

fun usandoWhen2(num: Int){
    println("\nFunção: usandoWhen2")
    /**
     * quando(valor) {
     *      forEsseValor -> faça isso
     *      forEsseOutroValor -> faça isso
     *      senão -> faça isso
     * }
     */
    when(num){
        2 -> println("é o numero 2")
        3 -> println("é o numero 2")
        else -> println("Não é nem o 2 nem o 3")
    }
}

fun usandoWhen3(num: Int){
    println("\nFunção: usandoWhen3")

    //atribui um valor a variável valor
    val valor = when {
        (num % 2) == 0 && (num % 3) == 0 -> 1
        (num % 2) == 0 -> 2
        (num % 3) == 0 -> 3
        else -> 4
    }

    //verifica se o valor é algum dos 3 abaixo
    when(valor){
        1 -> println("O número $num é divisível por 2 e por 3")
        2 -> println("O número $num é divisível por 2")
        3 -> println("O número $num é divisível por 3")
        else -> println("O número $num não é divisível por 2 nem por 3")
    }
}

/**
 * exercicio de fixação
 * Faça um programa que leia 3 numeros inteiros do usuário e exiba
 * qual deles é par ou impar
 * Exemplo de impressão
 * O número 1 é par, o 2 é impar e o 3 é par.
 */

