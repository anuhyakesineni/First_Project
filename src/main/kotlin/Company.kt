class Company() {
    var name: String? = null
    var id: String? = null
    var salary: Int? = null
}

fun main() {
    Company().apply {
        // initializing the members
        this.name = "Anuhya"
        id = "PTIN 511"
        salary = 12500
        println(name)
        println(id)
        println(salary)
    }
}