package main.cargos

import main.Logavel
import main.Pessoa

class Cliente(nome: String,
              cpf: String,
              clienteTipo: ClienteTipo,
              senha: String
) : Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "123456" ==
    fun autorizacao() {
        println("")
    }

    override fun toString(): String = """
                "nome: $nome" +
                "CPF: $cpf" +
                "TipoCliente: $clienteTipo""".trimIndent()
}