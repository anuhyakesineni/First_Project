fun main(){
    var size:Int
    print("Enter the size:")

    //reading the size
    size = Integer.valueOf(readLine())

    //creating hashmap
    var myHashMap = hashMapOf<Any?,Any?>()
    println("Enter the elements:")

    //reading the keys and values
    for( i in 1..size) {
        print("Enter key-$i:")
        var id = Integer.valueOf(readLine())
        print("Enter value-$i:")
        var name = readLine()
        myHashMap.put(id, name)
    }
    println("The elements in the hashMap:$myHashMap")

    //converting hashMap to list
    var myList=myHashMap.toList()
    print("The elements in the list:$myList")
}