fun main(){
    var size = 5
    //creating an array of size=5
    var myArray : Array<Int> = Array<Int>(5){0}
    println("Enter $size elements:")

    //reading the elements
    for(i in 0..size-1){
        myArray[i] = Integer.valueOf(readLine())
    }
    print("The elements in the array:")
    myArray.forEach { print("\t$it") }

    //converting array to arraylist
    var myArrayList= myArray.toList()
    println("\nThe elements in the arrayList:$myArrayList")
}