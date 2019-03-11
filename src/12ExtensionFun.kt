fun main(args: Array<String>) {
    println("This string will be modified".spaceToUnderScore())
    println(7.tripleValue())
}

fun String.spaceToUnderScore(): String {
    return this.replace(" ", "_")
}

fun Int.tripleValue(): Int = this * 3