package main

class Pessoa {

    var nome: String = "Elsa"
    var cpf: String = "123.456.789-00"
    //private set
}

fun main(){
    var elsa = Pessoa()
    elsa.cpf = "ABC.DEF.GHI-JK"

    println(elsa.nome)
    println(elsa.cpf)
}


