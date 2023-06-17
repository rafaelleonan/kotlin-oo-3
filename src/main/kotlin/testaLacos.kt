fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Rafael $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 10.0 + i

        println("Titular ($i): $titular")
        println("Número da Conta ($i): $numeroConta")
        println("Saldo da Conta ($i): $saldo")
        testaCondicoes(saldo)
        println("")
        i++
    }

    for (i in  5 downTo 1) {
        val titular: String = "Rafael $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 10.0 + i

        println("Titular ($i): $titular")
        println("Número da Conta ($i): $numeroConta")
        println("Saldo da Conta ($i): $saldo")
        testaCondicoes(saldo)
        println("")
    }
}