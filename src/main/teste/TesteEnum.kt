package main.teste

import main.cargos.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        element ->
       // println("${element.name} e ${element.descriçao}")
    }

    ClienteTipo.values().forEach {
       //     println("${it.name} e ${it.descriçao}")
    }

     var tipo = ClienteTipo.PF
    println("${tipo.name} e ${tipo.descriçao}")
    tipo = ClienteTipo.PJ
    println("${tipo.name} e ${tipo.descriçao}")
}