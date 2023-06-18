package br.com.alura.modelo

interface Autenticavel {
    fun autenticacao(senha: Int): Boolean
}