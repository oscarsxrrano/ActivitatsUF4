package Activitat6

class Pasta () {
    // Variables
    private var nom: String = ""
    private var preu: Double = 0.0
    private var pes: Double = 0.0
    private var calories: Int = 0

    // Constructores
    constructor (nom: String, preu: Double, pes: Double, calories: Int) : this() {
        this.nom = nom
        this.preu = preu
        this.pes = pes
        this.calories = calories
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
    fun getPes(): Double {
        return pes
    }

    fun setPes(pesUser: Double) {
        pes = pesUser
    }

    fun getCalories(): Int {
        return calories
    }

    fun setCalories(caloriesUser: Int) {
        calories = caloriesUser
    }

    override fun toString(): String {
        return "$nom: " +
                "Preu de $preu€, ${pes}gr i ${calories}kcal"
    }
}