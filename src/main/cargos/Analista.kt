package main.cargos

import main.Funcionario


class Analista : Funcionario {
    override var nome: String
    override var cpf: String

    constructor(
        nome: String,
        cpf: String,
        salario: Double,
    ) : super(nome, cpf, salario) {
        this.nome = nome
        this.cpf = cpf
    }

    override fun calculoAuxilio() = salario + (salario* 0.1)
}