fun main(args: Array<String>) {

    funWithArg(3, "Three")

    funWithArg(intArg = 3, strArg = "Three")

    funWithArg(strArg = "Three", intArg = 3)

    funWithDefaultArg(10)
    funWithDefaultArg()
}

fun simpleFun() : Int {
    return 5
}

fun simpleFunInline(): Int = 5

fun funWithArg(intArg: Int, strArg: String) {
    println("$intArg and $strArg")
}

fun funWithDefaultArg(intArg: Int = 8) {
    println("Value received $intArg")
}

//https://kotlinlang.org/docs/reference/functions.html
