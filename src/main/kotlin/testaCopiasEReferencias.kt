fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X: $numeroX")
    println("Número Y: $numeroY")

    val contaJoao = ContaCorrente(
        titular = "João",
        numero = 1001
    )
    val contaMaria = ContaCorrente(
        titular = "Maria",
        numero = 1002
    )
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("Titular conta joao: ${contaJoao.titular}")
    println("Titular conta maria: ${contaMaria.titular}")

    println("Endereço de memória class joao: $contaJoao")
    println("Endereço de memória class maria: $contaMaria")
}