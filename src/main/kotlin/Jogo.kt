package me.amlu

import com.google.gson.annotations.SerializedName

class Jogo {
    @SerializedName("title") var titulo: String? = null
    @SerializedName("thumb") var capa: String? = null
    val descricao = ""

    override fun toString(): String {
        return "Jogo:\n" +
                "titulo: $titulo \n" +
                "capa: $capa \n" +
                "descricao:$descricao \n"
    }

}