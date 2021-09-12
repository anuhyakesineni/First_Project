fun main(){
    var size = 5
    //creating an array of size=5
    var myArray : Array<Int> = Array<Int>(5){0}
    println("Enter $size elements:")

    //reading the elements
    for(i in 0..size-1){
        myArray[i] = Integer.valueOf(readLine())
    }

    println("The elements of the array:")
    myArray.forEach { print("$it\t") }

    //converting array to hashSet
    var myHashSet= myArray.toHashSet()
    println("\nThe elements in the hashSet:$myHashSet")
}