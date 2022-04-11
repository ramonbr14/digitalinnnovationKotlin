package main.cargos

import main.Funcionario
import main.Logavel

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel {

    override fun calculoAuxilio(): Double = salario * 0.4

    fun login(): Boolean = "senha 123" == senha

}

