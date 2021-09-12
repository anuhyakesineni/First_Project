
class TestClass {
    init {
    }
    var name:String? = null;
    constructor(str: String) {
        name = str
    }
}
fun main()
{
    val test = TestClass("Android programming")
    val test1 = test
    println("Output==${test1.name}")
}
