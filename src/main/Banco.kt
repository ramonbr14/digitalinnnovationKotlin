package main

data class Banco (
    val nome: String,
    val numero: Int
){
    fun bancoinfo() = "$nome - $numero"
}
