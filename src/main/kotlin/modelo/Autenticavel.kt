package modelo

interface Autenticavel {
    fun autenticacao(senha: Int): Boolean
}