package br.com.alura.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    val senha: Int,
    val endereco: Endereco = Endereco()
): Autenticavel {
    override fun autenticacao(senha: Int): Boolean = this.senha == senha
}