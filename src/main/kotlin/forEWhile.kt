fun usandoFor() {
    val conjuntoDeNumeros = 1..10
    for (numero in conjuntoDeNumeros) {
        print("$numero ")
    }
}

fun usandoFor2() {
    val conjuntoDeNumeros = 0..10
    for (numero in conjuntoDeNumeros) {
        println("$numero carneirinho")
    }
}

fun usandoFor3() {
    val conjuntoDeNumeros = 1..10
    val conjuntoDeNumeros2 = 1..3

    for (numero in conjuntoDeNumeros) {
        println("${numero}º vez que passou pelo primeiro for")
        for (numero2 in conjuntoDeNumeros2){
            println("     ${numero2}º vez que passou pelo segundo for")
        }
    }
}

fun usandoWhile() {
    val num = readln().toInt()
    var i = 0
    while (i <= num){
        print("$i ")
        i++
    }
}

fun menuComWhile() {
    var opcaoDoUsuario = -1
    while (opcaoDoUsuario != 0){
        println("Digite o numero da opção desejada")
        println("****MENU****")
        println("1 - Opção 1")
        println("2 - Opção 2")
        println("0 - Sair")
        opcaoDoUsuario = readln().toInt()
    }
    println("fim do programa")
}

fun usandoDoWhile(num: Int) {
    var i = 0
    do {
        print("$i ")
        i++
    } while (i <= num)
}

fun menuComDoWhile() {
    var opcaoDoUsuario: Int
    do {
        println("Digite o numero da opção desejada")
        println("****MENU****")
        println("1 - Opção 1")
        println("2 - Opção 2")
        println("0 - Sair")
        opcaoDoUsuario = readln().toInt()
    } while (opcaoDoUsuario != 0)
    println("fim do programa")
}
