abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    abstract val bonificacao: Double

    // outras maneiras de fazer a bonificação com método ou propriety
    //    open fun bonificacao(): Double {
    //        return salario * 0.10
    //    }
    //    open val bonificacao: Double
    //        get () {
    //            return salario * 0.10
    //        }
    // OU
    //    open val bonificacao get () = salario * 0.10
}