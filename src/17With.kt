fun main(args: Array<String>) {
    var mDataSet: String = "This is sample string"

    println(mDataSet.length)
    println(mDataSet.get(6))
    println(mDataSet.replace(" ", "_"))

    with(mDataSet) {
        println(length)
        println(get(6))
        println(replace(" ", "_"))
    }

    mDataSet.apply {

    }
}