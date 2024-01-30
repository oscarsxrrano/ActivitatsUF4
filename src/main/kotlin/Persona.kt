package org.example

import java.awt.Color

class Persona {

    var dni: String = ""
    var nom: String = ""
    var cognoms: String = ""
    var edat: Int = 0
    var estatCivil: Boolean = false

    // Constructores
    constructor (nom: String, cognoms: String){
        this.nom = nom
        this.cognoms = cognoms
    }

    constructor (dni: String, nom: String, cognoms: String, edat: Int, estatCivil: Boolean){
        this.dni = dni
        this.nom = nom
        this.cognoms = cognoms
        this.edat = edat
        this.estatCivil = estatCivil
    }

    fun aniversari() {
        edat++
    }

    fun casament() {
        estatCivil = true
    }

    fun divorci() {
        estatCivil = false
    }

    override fun toString(): String {
        return "El nom es $nom $cognoms, amb DNI $dni. \n" +
                "Te $edat anys i està ${if (estatCivil) "casat" else "divorciat"  }"
    }

    init {
        dni = "6747646L"
        nom = ""
        cognoms = ""
        edat = 0
        estatCivil = false
    }
}

class Cercle {
    var radi: Float = 0.0f
    var color: String = "blanc"

    constructor (radi: Float){
        this.radi = radi
    }

    constructor (radi: Float, color: String){
        this.radi = radi
        this.color = color
    }

    fun permimetre(): Float {

    }

    fun area(): Float {

    }

    init {
        radi = 4.0f
        color = "blanc"
    }
}