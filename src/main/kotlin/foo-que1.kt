fun foo(name: String, number: Int, toUpperCase: Boolean) =
    (if (toUpperCase) name.toUpperCase() else name) + number

fun main() {

    println(foo("a", 1, true))
    println(foo("b", number = 1, false))
    println(foo(name = "c", 2, toUpperCase = false))
    println(foo(name = "d", number = 2, toUpperCase = true))
}
