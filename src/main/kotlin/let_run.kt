fun test() {
    val str: String = "..."
    val result = str.let {
        println() // Receiver
        print(it) // Argument
        42 // Block return value
    }
}