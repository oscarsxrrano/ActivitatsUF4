package org.example

fun main() {
    val cr7: Persona = Persona("54645682T", "Cristiano", "Ronaldo", 38, false)
    cr7.aniversari()
    println(cr7)

    do {
        menu()
    } while ()
}

fun menu() {
    println("ESCULL UNA DE LES SEGUENTS OPCIONS")
    println("1.- Crear un cercle d'un radi determinat i d'un color determinat\n" +
            "2.- Crear un cercle d'un radi determinat\n" +
            "3.- Mostrar últim cercle creat\n" +
            "4.- Mostrar perímetre últim cercle creat\n" +
            "5.- Mostrar àrea últim cercle creat\n" +
            "6.- Sortir\n")
    val opcio = readln()
}