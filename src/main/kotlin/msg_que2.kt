import java.util.Scanner
class Message(var message: String?=null, var signature: String?=null)
fun main(){

    //creating an instance of scanner
    var sc = Scanner(System.`in`)

    //using apply method
    val body = Message().apply {

        //reading message and signature
        println("Enter the message:")
        message= sc.nextLine()
        println("Enter the signature:")
        signature= sc.nextLine()
        var text= message + " " + signature

        //printing the text
        println("The text is $text")
    }
}