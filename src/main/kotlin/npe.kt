/*fun main(args: Array<String>){
    val str1: String? = null
    val str2: String? = str1 as String?      // throw exception
    println(str1)
    println(str2)
}
fun main(args: Array<String>){
    var firstName: String? = "Anuhya"
    var lastName:String? = null
    println(firstName?.toUpperCase())
    println(lastName?.toUpperCase())
}*/
fun main(){
    var name:String?= "Anuhya"
    var len = name!!.length
    println("Length is $len")
}

