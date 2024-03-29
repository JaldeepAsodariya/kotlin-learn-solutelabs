fun higher(func: (Int) -> Unit) {
    func(7)
}

fun higher1(arg1: Int, func: (Int, String) -> Unit) {
    func(5, "String")
}

fun main(args: Array<String>) {

    // Type 1
    higher { param -> println(param) } // use of lambda
    higher { println(it) }

    // Type 2
    higher1(4, { i, s -> println("$i and $s") })

    higher1(4) { i, s ->
        println("$i and $s")
    }
}
