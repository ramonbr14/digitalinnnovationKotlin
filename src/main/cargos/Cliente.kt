package main.cargos

import main.ClienteTipo
import main.Logavel
import main.Pessoa

class Cliente(nome: String,
              cpf: String,
              val clienteTipo: ClienteTipo,
              val senha: String) : Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "123456" ==senha
    override fun autorizacao() {
        println("")
    }

    override var nome: String
        get() = ""
        set(value) {}
    override var cpf: String
        get() = ""
        set(value) {}

    override fun toString(): String {
        return "" +
                "nome: $nome" +
                "CPF: $cpf" +
                "TipoCliente: $clienteTipo".trimIndent()
    }
}