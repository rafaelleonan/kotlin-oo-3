// Construtor primário: class Conta {}
// Definir parametros no construtor primário: class Conta(titular: String, numero: Int, saldo: Double) {}
// Definir as propriedades no construtor primário: class Conta(var titular: String, var numero: Int, var saldo: Double) {}
// init {
//      //Executa alguma coisa durante inicialização do construtor da classe.
//    }
abstract class Conta (var titular: String = "", var numero: Int = 0) {
    var saldo = 0.0
        protected set
    fun depositar(deposito: Double) {
        if (deposito > 0.0) {
            this.saldo += deposito
            println("Depositando R$ ${deposito} na conta do ${this.titular}...\nSaldo anterior: R$ ${this.saldo - deposito}\n" +
                    "Saldo atual: R\$ ${this.saldo}")
        }
    }

    abstract fun sacar(saque: Double)

    fun transferir(transferencia: Double, destino: Conta): Boolean {
        if (this.saldo >= transferencia) {
            this.saldo -= transferencia
            destino.depositar(transferencia)
            return true
        }
        return false
    }
}