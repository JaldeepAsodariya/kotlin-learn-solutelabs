fun main(args: Array<String>) {

    samConversion(Listener { print("it's SAM Single Abstract Method") })

    samConversion(object : Listener {
        override fun onAction() {

        }
    })
}

fun samConversion(listener: Listener) {
    listener.onAction()
}