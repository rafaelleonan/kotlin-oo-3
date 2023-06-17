fun testaFuncionario() {
    val funcionario = Analista(
        "Rafael",
        "000.000.000-00",
        1200.00
    )

    println("Nome: ${funcionario.nome}")
    println("CPF: ${funcionario.cpf}")
    println("Salário: ${funcionario.salario}")
    println("Bonificação: ${funcionario.bonificacao}")

    val analista = Analista(
        "Leonan",
        "000.000.000-01",
        1200.00,
    )

    println("Nome: ${analista.nome}")
    println("CPF: ${analista.cpf}")
    println("Salário: ${analista.salario}")
    println("Bonificação: ${analista.bonificacao}")

    val gerente = Gerente(
        nome = "Gui Jr",
        cpf = "111.111.111-11",
        salario = 1200.00,
        senha = 12345678
    )

    println("Nome: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificacao}")

    if (gerente.autenticacao(12345678)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação")
    }

    val diretor = Diretor(
        nome = "Gui",
        cpf = "222.222.222-22",
        salario = 1200.00,
        senha = 12345678,
        plr = 200.00
    )

    println("Nome: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salário: ${diretor.salario}")
    println("Bonificação: ${diretor.bonificacao}")
    println("PLR: ${diretor.plr}")

    if (diretor.autenticacao(12345678)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação")
    }

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(funcionario)
    calculadoraBonificacao.registra(analista)
    calculadoraBonificacao.registra(gerente)
    calculadoraBonificacao.registra(diretor)

    println("Total de bonificação: ${calculadoraBonificacao.total}")
}