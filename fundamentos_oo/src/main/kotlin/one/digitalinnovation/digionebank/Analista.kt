package one.digitalinnovation.digionebank

class Analista (nome: String, cpf: String, salario: Double): Funcionario(nome, cpf, salario) {
    override fun calculaAuxlio() = salario * 0.1

    override fun toString(): String ="""
    nome:${nome}
    cpf:${cpf}
    salario:${salario}
    Auxilio:${calculaAuxlio()}
    """.trimIndent()






}