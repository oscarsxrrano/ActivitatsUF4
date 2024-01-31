package Activitat6

fun main() {
    // Tipus pastes
    val croissant: Pasta = Pasta("Croissant Xocolata", 1.0, 80.0, 120)

    val ensaimada: Pasta = Pasta("Ensaimada de la casa", 3.0, 90.0, 150)

    val donut: Pasta = Pasta("Donut Sucre", 2.5, 95.0, 135)

    // Prints pastes
    println("PASTES\n" +
            croissant + "\n" +
            ensaimada + "\n" +
            donut + "\n")

    // Tipus begudes
    val aigua: Beguda = Beguda("Aigua Bezolla", 1.0, false)

    val cafeTallat: Beguda = Beguda("Cafe Tallat", 1.35, false)

    val teVermell: Beguda = Beguda("Te Vermell", 1.5, false)

    val cola: Beguda = Beguda("Pepsi MAX", 1.65, true)

    // Prints begudes
    println("BEGUDES\n" +
            aigua + "\n" +
            cafeTallat + "\n" +
            teVermell + "\n" +
            cola + "\n")
}