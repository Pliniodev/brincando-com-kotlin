
fun principalLoop(){
    println("****Digite um numero inteiro****")
    val num = readln().toInt()
    exibeNumerosInteiros2(num)
}

fun exibeNumerosInteiros(num: Int) {
    var i = 0
    while (i <= num){
        print("$i ")
        i++
    }
}

fun exibeNumerosInteiros2(num: Int) {
    var i = 0
    do {
        print("$i ")
        i++
    } while (i <= num)
}

fun exibeNumerosInteiros3(num: Int) {
    val numerosDeZeroANum = 0..num
    for (numero in numerosDeZeroANum) {
        print("$numero ")
    }
}
