package Sofrendocomkotlin

fun main() {
    println(birthdayGreeting("Rover", 5))
    println(birthdayGreeting("Alex", 2))
    birthdayGreeting2("Fulano", 20)
    println(birthdayGreeting3("Fulano", 20))
    println(birthdayGreeting4("Fulano4", 34))
    escreveAFrase("carro")
    println()
    escreveAFrase("lapis")
}

fun escreveAFrase(objeto: String) {
    if (objeto == "lapis"){
        println("Esse é meu texto")
    } else {
        println("Você não me deu o lápis")
    }
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting3(name: String, age: Int): String {
    return "Happy Birthday, $name!\nYou are now $age years old!"
}

fun birthdayGreeting4(name: String, age: Int) =
    "Happy Birthday, $name!\nYou are now $age years old!"


fun birthdayGreeting2(name: String, age: Int): Unit {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    println("$nameGreeting\n$ageGreeting")
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
    } else if ((num % 3) == 0) {
        println("O número $num é divisível por três")
    } else {
        println("não é divisível nem por 2 nem por 3")
    }
}


/**A+B
A-B
A.B
A/B
(A+B).A
(A-B).B
(A+B).C
(A+B).(C-A)
(A+B).(C-D)
A-B%
 */


fun soma() {
    println("Escreva um número")
    val x = readln().toInt()
    println("Escreva outro número")
    val y = readln().toInt()

    val somaParcelas = x + y
    println("O resultado da soma é $somaParcelas")
}

fun subtracao() {
    println("Escreva um número")
    val x = readln().toInt()
    println("Escreva outro número")
    val y = readln().toInt()

    val resto = x - y
    println("O resultado da subtração é $resto")

}

fun multiplicacao() {
    println("Escreva um número")
    val x = readln().toInt()
    println("Escreva outro número")
    val y = readln().toInt()

    val produto = x * y
    println("O resultado da multiplicação é $produto")
}

fun divisao() {
    println("Escreva um número")
    val x = readln().toInt()
    println("Escreva outro número")
    val y = readln().toInt()

    val quociente = x / y
    println("O resultado da multiplicação é $quociente")
}

/**(A+B).A
 *
 */

fun expressao() {
    println("Escreva um número")
    val x = readln().toInt()
    println("Escreva outro número")
    val y = readln().toInt()

    val resultado = (x + y) * x
    println("O resultado da multiplicação é $resultado")

}

/**A-B%
 *
 */
fun aMenosB() {
    println("Escreva um número")
    val x = readln().toInt()
}


/**Ainda sobre funções e variáveis, mas agora vamos adicionar números com ponto flutuante(Double).
Crie um programa que seja capaz de:

Encontrar a área de um círculo, use como referência o PI só com duas casas decimais.
A apresentação do enunciado e do resultado no programa, ficam por sua conta.
Encontrar a área de um triângulo. A base e a altura precisam ser dadas pelo usuário, e precisam ser números com ponto flutuante.
Dividir dois números inteiros e apresentar o resultado em números decimais.
Encontrar o valor de 20% de um valor qualquer digitado pelo usuário em Reais(R$) */


fun areaDoCirculo() {
    println("Para calcular a área do círculo você deve saber o valor de seu raio")
    println("Sabendo o valor do raio basta aplicá-la a fórmula Pi*r², atribuindo a Pi= 3.14")
    println("Digite o valor do raio")
    val x = readln().toFloat()

    val resultado = 3.14 * x * x
    println("A área da circunferência é Ac = 3.14 *$x²")
    println("Ac= $resultado")

}

/** Área do triângulo */

fun areaDoTriangulo() {
    println("Podemos calcular a área do triângulo multiplicando o comprimento da base pela altura e dividindo esse produto por 2")
    println("Sabendo essas dimensões calcule a área do triângulo")
    println("Informe o valor da base")
    val x = readln().toFloat()
    println("Informe a altura")
    val y = readln().toFloat()

    val valorDaArea = (x * y) / 2

    println("O valor da área do triângulo de base $x e altura $y é $valorDaArea")

}

fun divisaoNumerosInteiros() {

    println("Digite um numero")
    val x = readln().toFloat()
    println("Digite outro numero")
    val y = readln().toFloat()

    val dividindo = x / y

    println("Esse é o resultado da divisão $dividindo")
}

/**Encontrar o valor de 20% de um valor qualquer digitado pelo usuário em Reais(R$) */

fun porcentagem() {

    println("Para calcular 20% de um número basta multiplicarmos esse número por 0.20")
    println("Digite um valor")
    val x = readln().toFloat()

    val calculo = (0.2 * x)

    println("Assim, 20% de $x é R$ $calculo")
}

/**Um número digitado pelo usuário é par. */

fun numeroPar(numero: String): Int {
    println("Digite um $numero e aperte enter")
    return readln().toInt()

}

