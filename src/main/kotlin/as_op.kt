fun main(){

    //initializing str1
    var str1: Any = "Purple Talk"

    //initializing str2 to str1 using safe cast operator
    val str2: String? = str1 as? String

    //re- initilizing str1
    str1 = 511

    // type casting not possible so returns null to str3
    val str3: String? = str1 as? String
    println(str1)
    println(str2)
    println(str3)

}