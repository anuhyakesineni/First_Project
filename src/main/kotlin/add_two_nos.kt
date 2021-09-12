import java.util.*;
fun main(){
    //creating instance for scanner
    var sc = Scanner(System.`in`)

    //decalring two numbers
    var number1: Int
    var number2: Int

    //reading two numbers
    println("Enter number1:")
    number1 = sc.nextInt()
    println("Enter number2:")
    number2 = sc.nextInt()

    // calling the function and printing the result
    print("The sum of $number1 and $number2 is ${add(number1,number2)}")
}

//creating function for addition
fun add(n1:Int,n2:Int)= (n1.plus(n2))
