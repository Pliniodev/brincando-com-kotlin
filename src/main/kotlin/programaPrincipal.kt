//fun main(){
//    val entrada1 = inserindoNumeros("primeiro")
//    val entrada2 = inserindoNumeros("segundo")
//    val entrada3 = inserindoNumeros("terceiro")
//
//    val primeiroResultado = registro(entrada1, "primeiro")
//    val segundoResultado = registro(entrada2, "segundo")
//    val terceiroResultado = registro(entrada3, "terceiro")
//
//    println("$primeiroResultado $segundoResultado $terceiroResultado")
//}

fun inserindoNumeros(numero: String): Int {
    println("Digite o $numero e aperte o enter")
    return readln().toInt()
}

fun registro(num: Int, posicao: String): String {
    if ((num % 2) == 0) {
        return "O $posicao é par"
    } else {
        return "O $posicao é impar"
    }
}