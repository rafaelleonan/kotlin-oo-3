package br.com.alura.teste

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) println("modelo.Conta é positiva")
    else if (saldo == 0.0) println("modelo.Conta é neutra")
    else println("modelo.Conta é negativa")

    when {
        saldo > 0.0 -> println("modelo.Conta é positiva")
        saldo == 0.0 -> println("modelo.Conta é neutra")
        else -> println("modelo.Conta é negativa")
    }
}