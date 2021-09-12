/**
class Person() {
    var name: String = "Abcd"
    var address: String = "xyz"
    fun displayInfo() = print("\n Name: $name\n ")
}

 fun performLetOperation() {
    val person = Person().let {
        return@let "The name of the Person is: ${it.name}"
    }
    print(person)
}
fun main(){
    var obj=Person()
    obj.displayInfo()
    performLetOperation()
}
     **/