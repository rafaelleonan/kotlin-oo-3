fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Gui",
        cpf = "000.000.000-00",
        salario = 12000.00,
        senha = 123456
    )

    val diretora = Diretor(
        nome = "Guine",
        cpf = "111.111.111-11",
        salario = 15000.00,
        senha = 123456,
        plr = 2500.00
    )

    val cliente = Cliente(
        nome = "Rafael",
        cpf = "222.222.222-22",
        senha = 144123
    )

    val sistema = SistemaInterno()
    sistema.entrar(gerente, 123456)
    sistema.entrar(diretora, 12366)
    sistema.entrar(cliente, 12366)
}