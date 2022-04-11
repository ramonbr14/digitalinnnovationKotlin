import main.cargos.ClienteTipo
import main.cargos.Cliente
import main.teste.TesteAutenticacao

fun main(){
    val rapunzel = Cliente(
        nome = "Rapunzel de Corona",
        cpf = "777.777.777-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(rapunzel)

    TesteAutenticacao().autenticar(rapunzel)
}