package me.amlu

/**
 * The class Jogo that represent the game.
 *
 * @author Daniel Tikamori
 */
data class Jogo(val titulo: String, val capa: String) {

    val descricao: String? = null

    override fun toString(): String {
        return "Meu Jogo:\n" +
                "Título: $titulo \n" +
                "capa: $capa \n" +
                "Descricao:$descricao"
    }

}