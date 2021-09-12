import java.lang.ArithmeticException
fun main(){
    try{
        print("Enter number:")

        //reading a number
        var n:Int = Integer.valueOf(readLine())
        //dividing n by 0
        n= n/0
        println(n)
    }

    catch(e:ArithmeticException){
        println("The exception is ${e.message}")
    }
}