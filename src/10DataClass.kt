data class User(var id: Int, var name: String)

/*
* This wil automatically create
* equals() & hashCode()
* toString()
* getter and setters
* copy()
*
* all this
* */

// data class with custom getter and setters
data class Person(var id: Int, private var _name: String) {
    var name = _name
        get() = field
        set(value) {
            field = "$value will be modified"
        }
}

fun main(args: Array<String>) {
    val mUser = User(1, "Name")
    mUser.name = "value"
    println(mUser.name)

    var mPerson = Person(1, "Name")
    mPerson.name = "New Value"
    println(mPerson.name)
}
