package main.cargos

import main.Funcionario


class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome = nome,cpf = cpf ,salario = salario){

    override fun calculoAuxilio() = salario + (salario* 0.1)
    override var nome: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var cpf: String
        get() = TODO("Not yet implemented")
        set(value) {}
}