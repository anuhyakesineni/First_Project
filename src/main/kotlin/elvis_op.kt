fun main() {
    //declaring a string with name
    var name : String?  = "Anuhya Kesineni"
    println(name?.length)

    //re-assigning name to null
    name = null
    println(name?.length ?: "Can't find length as str is null")

}