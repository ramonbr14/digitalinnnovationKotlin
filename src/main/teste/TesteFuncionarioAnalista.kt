package main.teste

import main.Funcionario
import main.ImprimeRelatorioFuncionario
import main.cargos.Analista

fun main(){
    var anna = Analista(nome = "Anna de Arendelle", cpf = "111.222.333-44", 15000.0)
    ImprimeRelatorioFuncionario.imprime(anna)

}