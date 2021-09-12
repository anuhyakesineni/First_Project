data class Person(var name: String, var age: Int){

}
fun main(){

    //creating object for Person class
    val person = Person("Xcube", 42)

    //printing the current details
    println("The current name is ${person.name} \nThe current age is ${person.age}")
    var age= Person("Xcube", 42).also{
        it.age=21
        it.age
    }.run{
        age

    }

    //printing the updated age
    println("The updated age is $age")

}