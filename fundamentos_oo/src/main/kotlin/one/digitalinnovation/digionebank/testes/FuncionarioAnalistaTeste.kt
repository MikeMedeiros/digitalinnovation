package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main() {
    val mike = Analista(
        nome = "mikael", cpf = "122.133.133-13", salario =
        2000.0

    )


    ImprimeRelatorio.imprime(mike)
}
