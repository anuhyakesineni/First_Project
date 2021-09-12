
fun main(){

    var size:Int
    println("Enter the size:")
    //reading the size
    size = Integer.valueOf(readLine())

    //creating an arraylist
    var myArrayList : ArrayList<Int> = ArrayList<Int>(size)
    println("Enter $size elements:")

    //reading the elements
    for(i in 1..size){
        var element = Integer.valueOf(readLine())
        myArrayList.add(element)
    }
    println("The elements in the list:$myArrayList")

    //converting arraylist to array
    var myArray= myArrayList.toArray()
    print("The elements in the array:")
    myArray.forEach {  print("$it\t")}
}