package main

import java.math.BigDecimal

class Funcionario(
    override var nome: String,
    override var cpf: String,
    var salario: BigDecimal
): Pessoa(nome,cpf) {


}