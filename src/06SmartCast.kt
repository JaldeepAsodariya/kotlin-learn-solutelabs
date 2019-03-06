fun main(args: Array<String>) {
    var sample: Any = "I don't know, which type is this"

    if (sample is String) {
        println(sample.length) // Here, "sample" automatically casts to String
    }

    if (sample is Int) {
        println(sample + 7)
    }

    if (sample !is Int) {
        println(sample)
    }
}
