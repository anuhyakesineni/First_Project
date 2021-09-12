fun main() {
    // declaring and initializing variable to null
    var num: Int? = null

    // using let function
    num?.let {
        // will not execute as num is null
        print(it)
    }

    // re-initializing to 592
    num = 511
    num?.let {
        // statement(s) will execute
        // as a is not null
        print(num)
    }
}