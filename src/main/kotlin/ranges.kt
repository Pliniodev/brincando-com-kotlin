//Ranges = intervalos
fun imprimeIntervalos() {
    val intervalo = 0..3

    intervalo.forEach { numeroDoIntervalo ->
        println("$numeroDoIntervalo ")
    }
}

fun imprimeIntervalos2() {
    val intervalo = 0..10 step 3

    intervalo.forEach{ numeroDoIntervalo ->
        println("$numeroDoIntervalo ")
    }
}

fun imprimeIntervalos3() {
    val fimIntervalo = 10
    val intervalo = 0..fimIntervalo

    intervalo.forEach{ numeroDoIntervalo ->
        print("$numeroDoIntervalo ")
    }
}

fun imprimeIntervalos4() {
    println("Digite o fim do intervalo")
    val fimIntervalo = readln().toInt()
    val intervalo = 0..fimIntervalo step 5

    intervalo.forEach{ numeroDoIntervalo ->
        print("$numeroDoIntervalo ")
    }
}

fun imprimeTabuada(){
    val num = readln().toInt()
    val multiplicador = readln().toInt()

    val intervalo = 0..num

    intervalo.forEach{ numeroDoIntervalo ->
        val tabuada = numeroDoIntervalo * multiplicador
        println("$numeroDoIntervalo x $multiplicador = $tabuada")
    }
}

fun verificaExistencia(){
    val conjuntoDeNum = 0..10
    val resposta = if (4 in conjuntoDeNum) "EXISTE" else "NÃO EXISTE"
    println("O numero $resposta no intervalo")
}

fun verificaExistencia2(){
    println("Digite um número pra verificar se ele está no conjunto de 1 a 10")
    val num = readln().toInt()
    val conjuntoDeNum = 0..10
    val resposta = if (num in conjuntoDeNum) "ESTÁ" else "NÃO ESTÁ"
    println("O numero $num $resposta no conjunto de 1 a 10")
}