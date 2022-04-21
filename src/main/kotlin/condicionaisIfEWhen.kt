fun usandoEstruturasCondicionais() {
    val num = imprimeEnunciadoCondicionais()
    usandoWhen3(num)
}

fun imprimeEnunciadoCondicionais(): Int {
    println("Digite um numero")
    return readln().toInt()
}

fun usandoIf(num: Int) {
    /**
     * Sintaxe
     * se(condição) {
     *      faça isso
     * } senão se (outraCondição) {
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
    val valor = when {
        (num % 2) == 0 && (num % 3) == 0 -> "por2ePor3"
        (num % 2) == 0 -> "por2"
        (num % 3) == 0 -> "por3"
        else -> "nemPor2NemPor3"
    }

    when(valor){
        "por2ePor3" -> println("O número $num é divisível por 2 e por 3")
        "por2" -> println("O número $num é divisível por 2")
        "por3" -> println("O número $num é divisível por 3")
        else -> println("O número $num não é divisível por 2 nem por 3")
    }
}
