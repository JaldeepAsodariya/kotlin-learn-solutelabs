object Utils {
    fun getStaticValue(): Int {
        return Int.MAX_VALUE
    }

    val APP_NAME = "Kotlin Features"
}

fun main(args: Array<String>) {
    println(Utils.getStaticValue())
    println(Utils.APP_NAME)
}
