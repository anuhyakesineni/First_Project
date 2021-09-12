fun main(args: Array<String>) {

    //decalring a string
    var id: String?
    print("Enter id:")

    //reading the input
    id = readLine()

    //calling the function
    id_check(id)
    println("Welcome")
}
fun id_check(id: String?) {


    //checking for valid id
    if(id?.length!=3 )
        throw ArithmeticException("You have entered incorrect id")
    else
        println("You have entered correct id")
}