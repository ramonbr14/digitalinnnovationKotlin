package main.teste

import main.Banco

fun main(){
    val bancoArendelle = Banco("ArendelleBank",1)

    //println(bancoArendelle.nome)
    //println(bancoArendelle.numero)

    println(bancoArendelle.bancoinfo())

    val bancoAthohalan = bancoArendelle.copy("Athohalan", 2)
    println(bancoAthohalan.bancoinfo())

}