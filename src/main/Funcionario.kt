package main

abstract class Funcionario(nome: String, cpf: String, salario: Any) : Pessoa(nome, cpf) {
    abstract val salario: Any

    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String {
        return "" +
                "nome: $nome, " +
                "CPF: $cpf, " +
                "Salario: $salario, " +
                "Auxilio: ${calculoAuxilio()}, ".trimIndent()
    }
}