
fun somaNumeros() {
    println ("digite um numero e aperte inteiro")
    val num1 = readln()
    println ("digite outro numero e aperte enter")
    val num2 = readln()
    val soma = num1 + num2
    println(soma)
    println("Esse é o resultado: $soma")
}


fun somaDoisNumerosDoUsuario(){
    println("Iniciando soma")
    println("Digite um numero inteiro e aperte enter")
    val num1 = readln().toInt()
    println("Digite outro numero inteiro e aperte enter")
    val num2 = readln().toInt()
    val somaDosNumeros = num1 + num2
    println(somaDosNumeros)
    println("Esse é o resultado da soma: $somaDosNumeros, o primeiro numero é: $num1")
}


fun exemploDeVariaveis() {
    val variavelImutavel = "Frase que não pode ser alterada"
    var variavelMutavel = "Frase que pode ser alterada"
    println(variavelMutavel)
    println(variavelImutavel)
}

fun somaValoresEImprime() {
    val num1 = 1
    val num2 = 5
    val numerosSomados = num1 + num2
    println(numerosSomados)
}

fun somaVariosNumerosEImprime(){
    val somandoVariosNumeros = 1 + 2 + 3 + 4
    println(somandoVariosNumeros)
}

fun multiplicaDoisNumerosDoUsuario(){
    println("Iniciando multiplicacao")
    println("Digite um numero inteiro e aperte enter")
    val num1 = readln().toInt()
    println("Digite outro numero inteiro e aperte enter")
    val num2 = readln().toInt()
    val resultadoDaMultiplicacao = num1 * num2
    println("Esse é o produto da multiplicação: $resultadoDaMultiplicacao")
}