package me.amlu

/**
 * To deserialize the data that comes from the api and bring it to the object,
 * we need to create 2 classes responsible for catching the data and transforming it into an object.
 *
 * Class InfoApiShark will be responsible for catching the data from the api
 * Class InfoJogo will be responsible for bringing data from 'info'(json) (where the thumb and title data are and brought
 * by the class InfoApiShark)
 *
 * @author Daniel Tikamori
 */
data class InfoApiShark(val title: String, val thumb: String)
