fun main(){
    println("Enter the number:")

    //reading the number
    var number :Int = Integer.valueOf(readLine())
    //creating instance for math class
    var obj= math()
    //calling the armstrong function
    var result:Int = obj armstrong number


    if(result==number)
        println("$number is an armstrong number")
    else
        println("$number is not an armstrong number")
}
class math{
infix fun armstrong(n:Int):Int {

    var num = n
    var n1 = n
    var digit: Int
    var sum = 0
    var numberOfDigits = 0

    //counting the number of digits
    while (num!= 0) {
        numberOfDigits += 1
        num = num / 10
    }

    //finding the sum
    while (n1 != 0) {
        digit = n1 % 10
        var p = power(digit, numberOfDigits)
        sum = (sum + p)
        n1 = n1 / 10
    }
    return sum
    }

}
fun power(x:Int, y:Int):Int{
    var p1 = 1
    //finding the power
    for( i in 1..y)
        p1 *=x
    return p1

}

