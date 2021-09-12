fun main(){

    //reading the numbers
    println("Enter number1:")
    var number1 = Integer.valueOf(readLine())
    println("Enter number2:")
    var number2 = Integer.valueOf(readLine())
    factorialWithIteration ({
        if(number1==1 || number1==0) {
            println("The factorial of $number1 is 1")
            return
        }
        var f=1

        //finding the factorial using iteration
        for(i in 2..number1)
            f*=i
        println("factorial of $number1 using iteration is $f\t")

    })

    println("factorial of $number2 using recursion is ${factorialWithRecursion(number2)}")
}
inline fun factorialWithIteration(factUsingInteration:()->Unit){

    factUsingInteration()

}
inline fun factorialWithRecursion(n:Int):Int{
    return factUsingRecursion(n)
}

fun factUsingRecursion(n:Int):Int{
    if(n==0 || n==1)
        return 1
    //finding the factorial using recursion
    else
        return(n*factUsingRecursion(n-1))
}
