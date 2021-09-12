data class Person1(var name: String, var age: Int)

fun main() {

    //creating object for Person class
    val person = Person1("Xcube", 42)
    println("The present age of the person is ${person.age}")

    //using let method to multiply the age
    person.let{
        it.age= it.age*2
    }
    print("The age of person after multiplying with 2 is ${person.age}")
}
