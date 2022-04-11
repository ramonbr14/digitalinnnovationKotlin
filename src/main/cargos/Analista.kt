package main.cargos

import main.Funcionario


class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome, cpf, salario) {

   // override fun calculoAuxilio(): Double  = salario * 0.1
    /*override var nome: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var cpf: String
        get() = TODO("Not yet implemented")
        set(value) {}*/
}