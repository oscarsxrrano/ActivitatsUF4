package org.example

fun main() {
    val cr7: Persona = Persona("54645682T", "Cristiano", "Ronaldo", 38, false)
    cr7.aniversari()
    println("$cr7 \n")
    var sortida = false
    var myCercle: Cercle = Cercle(0.0f, "Blanc")
    do {
        val men = menu()
        println(men)

        when (men) {
            1 -> myCercle = Cercle(2.0f, "Blau")
            2 -> myCercle = Cercle(3.0f)
            3 -> println(myCercle)
            4 -> println(myCercle.permimetre())
            5 -> println(myCercle.area())
            6 -> sortida = true
        }
    } while (!sortida)
}

fun menu(): Int {
    println("\nESCULL UNA DE LES SEGUENTS OPCIONS")
    println("1.- Crear un cercle d'un radi determinat i d'un color determinat\n" +
            "2.- Crear un cercle d'un radi determinat\n" +
            "3.- Mostrar últim cercle creat\n" +
            "4.- Mostrar perímetre últim cercle creat\n" +
            "5.- Mostrar àrea últim cercle creat\n" +
            "6.- Sortir\n")
    val opcio = readInt("Escull una opció", "Ha de ser un INT", "Ha de ser entre 1 i 6", 1, 6 )
    return opcio
}