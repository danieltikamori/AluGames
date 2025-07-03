package me.amlu

/**
 * Class InfoJogo will be responsible for bringing data from 'info'(json) (where the thumb and title data are and brought
 * by the class InfoApiShark)
 *
 * See class InfoApiShark
 *
 * @author Daniel Tikamori
 */

data class InfoJogo(val info:InfoApiShark) {

    override fun toString(): String {
        return info.toString()
    }
}