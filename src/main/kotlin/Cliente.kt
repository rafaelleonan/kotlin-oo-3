class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
): Autenticavel {
    override fun autenticacao(senha: Int): Boolean = this.senha == senha
}