package br.com.alura.teste

import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X: $numeroX")
    println("Número Y: $numeroY")
    val cliente1 = Cliente("João", "000.000.000-03", 1003)
    val cliente2 = Cliente("Maria", "000.000.000-02", 1002)
    val contaJoao = ContaCorrente(
        titular = cliente1,
        numero = 1001
    )
    val contaMaria = ContaCorrente(
        titular = cliente2,
        numero = 1002
    )
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("Titular conta joao: ${contaJoao.titular.nome}")
    println("Titular conta maria: ${contaMaria.titular.nome}")

    println("Endereço de memória class joao: $contaJoao")
    println("Endereço de memória class maria: $contaMaria")
}