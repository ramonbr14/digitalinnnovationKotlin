package main

class Pessoa {

    var nome: String = "Elsa";
    var cpf: String = "123.456.789-00"
}

fun main(){
    var elsa = Pessoa()

    println(elsa.nome)
    println(elsa.cpf)
}