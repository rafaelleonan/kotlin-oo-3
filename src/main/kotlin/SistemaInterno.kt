class SistemaInterno {
    fun entrar(gerente: Autenticavel, senha: Int) {
        if (gerente.autenticacao(senha)) {
            println("Bem-vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}