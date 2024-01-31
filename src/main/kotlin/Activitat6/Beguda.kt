package Activitat6

class Beguda () {
    private var nom: String = ""
    private var preu: Double = 0.0
    private var sucre: Boolean = false


    // Constructores
    constructor (nom: String, preu: Double, sucre: Boolean) : this() {
        this.nom = nom
        this.preu = preu
        this.sucre = sucre
    }

    // Funcions
    fun getNom(): String {
        return nom
    }

    fun setNom(nomUser: String) {
        nom = nomUser
    }
    fun getPreu(): Double {
        return preu
    }
    fun setPreu(preuUser: Double) {
        preu = preuUser
    }
    fun getSucre(): Boolean {
        return sucre
    }

    fun setPes(sucreUser: Boolean) {
        sucre = sucreUser
    }

    override fun toString(): String {
        return "$nom: " +
                "Preu de $preu€ i ${if (sucre) "te sucre" else "no te sucre"}"
    }

}