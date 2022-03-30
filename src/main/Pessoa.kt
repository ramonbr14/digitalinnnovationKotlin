package main

class Pessoa {

    var nome: String = "Rainha Elsa de Arendelle"
    var cpf: String = "123.456.789-00"
    //private set

    constructor()

    fun pessoainfo() = "$nome " + "$cpf"
}

fun main(){
    var elsa = Pessoa()
    //elsa.cpf = "ABC.DEF.GHI-JK"

    println(elsa.pessoainfo())
}


