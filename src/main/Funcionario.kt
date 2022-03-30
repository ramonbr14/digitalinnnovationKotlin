package main

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    var salario: BigDecimal
): Pessoa() {
    fun calculoAuxilio(){}
}