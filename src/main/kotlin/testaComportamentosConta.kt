fun testaComportamentosConta() {
    // Pode se declarar assim também sem seguir a ordem dos parametros, utilizando labels:
    // val conta1 = Conta(titular = "Rafael", numero = 1000)
    // val conta1 = Conta(numero = 1000, titular = "Rafael")
    val conta1 = ContaCorrente("Rafael", 1000)
    println("Conta 1, titular: ${conta1.titular}")
    println("Conta 1, número: ${conta1.numero}")
    println("Conta 1, saldo: ${conta1.saldo}")
    conta1.depositar(20.0)
    conta1.sacar(18.0)
    println("")

    val conta2 = ContaPoupanca("Rafael", 1001)
    if (conta1.transferir(1.0, conta2)) {
        println("Transferência realizada da conta ${conta1.titular} para a conta ${conta2.titular}, no valor de R$ 1,00")
    } else {
        println("Não foi possível realizar a transferência da conta ${conta1.titular} para a conta ${conta2.titular}")
    }
}