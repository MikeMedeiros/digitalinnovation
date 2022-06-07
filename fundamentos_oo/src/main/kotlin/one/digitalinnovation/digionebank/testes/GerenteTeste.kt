package one.digitalinnovation.digionebank.testes



import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(
        nome = "maria", cpf = "122.133.133-13", salario =
        3000.0
    )
    ImprimeRelatorio.imprime(maria)
}
