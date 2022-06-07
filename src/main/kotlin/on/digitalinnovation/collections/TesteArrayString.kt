package on.digitalinnovation.collections

fun main() {
    val nomes = Array (3) {""}
    nomes[0] = "maria"
    nomes[1] = "mario"
    nomes[2] = "joao"

    for (nome in nomes) {
        println(nome)
    }

    println("----------------------")
    nomes.sort()
    nomes.forEach { println(it) }
}

