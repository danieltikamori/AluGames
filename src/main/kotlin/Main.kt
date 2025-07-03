package me.amlu

import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.http.HttpResponse.BodyHandlers


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val client: HttpClient? = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=612"))
        .build()

    val response: HttpResponse<String?>? = client!!
        .send(request, BodyHandlers.ofString())

    val json = response?.body()
    println(json)

    /**
     * Instantiates a new Gson object
     */
    val gson = Gson()

    /**
     * Deserializes the JSON string into an object
     */
    val meuInfoJogo = gson.fromJson(json, InfoJogo::class.java)

    /**
     * Instantiates a new Jogo object
     */
    val meuJogo = Jogo(
        meuInfoJogo.info.title,
        meuInfoJogo.info.thumb
    )

    /**
     *  Prints the Jogo object
     */
    println(meuJogo)

}