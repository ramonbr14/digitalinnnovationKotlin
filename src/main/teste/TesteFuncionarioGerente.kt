package main.teste

import main.Funcionario
import main.ImprimeRelatorioFuncionario
import main.cargos.Analista
import main.cargos.Gerente

fun main(){
    val anna = Gerente(
        nome = "Anna de Arendelle",
        cpf = "111.222.333-44",
        1500.0,
        "Senha123"
    )
    ImprimeRelatorioFuncionario.imprime(anna)

    //TesteAutenticacao().autenticar(anna)
}