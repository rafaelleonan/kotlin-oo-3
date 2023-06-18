package br.com.alura.teste

import br.com.alura.modelo.*

fun testaObjects() {
    val cliente = object: Autenticavel {
        val nome: String = "Leonan"
        val cpf: String = "000.000.000-11"
        val senha: Int = 1000

        override fun autenticacao(senha: Int): Boolean = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(cliente, 1000)

    var cliente1 = Cliente("Rafael", "000.000.000-00", 12345)
    var contaPoupanca = ContaPoupanca(cliente1, 1000)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}