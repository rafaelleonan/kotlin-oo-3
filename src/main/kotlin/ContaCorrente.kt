class ContaCorrente(
    titular: String,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(saque: Double) {
        val valorComTaxa = saque + (saque*0.1)
        if(this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
            println("Saque realizado no valor de R$ ${valorComTaxa}, saldo atual de R$ ${this.saldo}")
        } else {
            println("Saldo na conta insuficiente: R$ ${this.saldo}")
        }
    }
}