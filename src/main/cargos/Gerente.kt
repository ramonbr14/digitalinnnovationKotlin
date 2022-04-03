package main.cargos

import main.Funcionario
import main.Logavel

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
) : Funcionario(nome = nome,cpf = cpf, salario = salario), Logavel {
    override fun calculoAuxilio() = salario + (salario* 0.1)

    override fun login(): Boolean = "senha 123" == senha
    override fun autorizacao() {
        TODO("Not yet implemented")
    }
}