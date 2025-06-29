package me.amlu

class Jogo {
    var titulo = ""
    var capa = ""
    val descricao = ""

    override fun toString(): String {
        return "Jogo:\n" +
                "titulo: $titulo \n" +
                "capa: $capa \n" +
                "descricao:$descricao \n"
    }

}