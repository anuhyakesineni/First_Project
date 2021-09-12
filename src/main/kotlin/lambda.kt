import  java.util.Scanner;
fun main(){

    //creating instance for Scanner
    var s = Scanner(System.`in`)

    //reading two numbers
    print("Enter number1:")
    var number1 = s.nextInt()
    print("Enter number2:")
    var number2 = s.nextInt()

    //addition using lamda funcitons
    var sum={number1:Int,number2:Int->number1+number2}

    //substraction using lamda function
    var diff= {number1:Int,number2:Int->number1-number2}

    //multiplication using lamda function
    var mul= {number1:Int,number2:Int->number1*number2}

    //division using lamda function
    var div= {number1:Int,number2:Int->number1/number2}

    println("The sum of $number1 and $number2 is ${sum(number1,number2)}")
    println("The difference  of $number1 and $number2 is ${diff(number1,number2)}")
    println("The multiplication of $number1 and $number2 is ${mul(number1,number2)}")
    println("The division of $number1 and $number2 is ${div(number1,number2)}")
}