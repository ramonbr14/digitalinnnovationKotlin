package main.teste

import main.Funcionario
import java.math.BigDecimal

fun main(){
    var anna = Funcionario(nome = "Anna de Arendelle", cpf = "111.222.333-44", BigDecimal.valueOf(15000))


    println(anna.nome)
    println(anna.cpf)
    println("Salario da Rainha: R$ " + anna.salario)
}