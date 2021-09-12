fun main(){

    var size:Int
    println("Enter the size:")
    //reading the size
    size = Integer.valueOf(readLine())

    //creating an arraylist
    var myHashSet = hashSetOf<Int>()
    println("Enter $size elements:")
    //reading the elements
    for(i in 1..size){
        var element = Integer.valueOf(readLine())
        myHashSet.add(element)
    }
    println("The elements in the hashSet:")
    println(myHashSet)
    //converting hashSet to array
    var myArray= myHashSet.toArray()
    print("The elements in the array:")
    myArray.forEach {  print("\t$it")}
}