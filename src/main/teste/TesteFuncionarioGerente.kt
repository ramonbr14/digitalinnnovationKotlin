package main.teste

import main.ImprimeRelatorioFuncionario
import main.cargos.Gerente

fun main(){
    val anna = Gerente(
        "Anna de Arendelle",
        "111.222.333-44",
        1500.0,
        "Senha123"
    )
    ImprimeRelatorioFuncionario.imprime(anna)

    TesteAutenticacao().autenticar(anna)
}