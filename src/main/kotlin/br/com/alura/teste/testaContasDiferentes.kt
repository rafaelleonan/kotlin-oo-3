package br.com.alura.teste

import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val cliente1 = Cliente("Rafael", "000.000.000-00", 1001)
    val contaCorrente = ContaCorrente(
        titular = cliente1,
        numero = 1001
    )
    val cliente2 = Cliente("Leonan", "000.000.000-01", 1002)
    val contaPoupanca = ContaPoupanca(
        titular = cliente2,
        numero = 1002
    )

    contaCorrente.depositar(1000.00)
    contaPoupanca.depositar(1000.00)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.00)
    contaPoupanca.sacar(100.00)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca)

    println("saldo corrente após realizar transferência: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transferir(100.0, contaCorrente)

    println("saldo poupança após realizar transferência: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}