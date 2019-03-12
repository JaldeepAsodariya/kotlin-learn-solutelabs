fun main(args: Array<String>) {

    val ahm = City("Ahmedabad", 1000)
    val mumbai = City("Mumbai", 2000)

    val totalPopulation = ahm - mumbai

    println(totalPopulation)

    ahm.isLargerThan(mumbai) // normal call

    ahm isLargerThan mumbai // infix call
}

data class City(val name: String, val population: Int) {

    operator fun minus(otherName: City): Int {
        return this.population + otherName.population
    }

    infix fun isLargerThan(otherName: City): Boolean {
        return this.population >= otherName.population
    }
}

//https://kotlinlang.org/docs/reference/operator-overloading.html
