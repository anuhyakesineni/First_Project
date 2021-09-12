val aVar by lazy {
    println("I am computing this value")
    "Hola"
}
fun main(args: Array<String>) {
    //println(aVar)
    println(aVar)
    println(aVar)
}
