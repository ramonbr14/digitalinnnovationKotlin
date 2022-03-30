package main.teste

import main.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        element ->
        println("${element.name} e ${element.toString()}")
    }

    ClienteTipo.values().forEach {
            println("${it.name} e ${it.toString()}")
    }

}