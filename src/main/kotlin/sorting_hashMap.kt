
fun main() {

    //creating a map
    var myMap = mapOf(511 to "anu",598 to "sri",593 to "sai",599 to "harry",597 to "durga")
    println("Before sorting: $myMap")
    myMap = myMap.toMutableMap()

    //creating a list with sorted values
    var sorted_values_list=myMap.values.sorted()

    //creating a mutable map for inserting keys with sorted values
    var map_with_sorted_values=mutableMapOf<Int,String>()

    //inserting the key,value pairs in sorted values order into mutable map
    for(i in sorted_values_list){
        for(j in myMap.keys){
            if(i.equals(myMap.get(j))){
                map_with_sorted_values.put(j,i);
            }
        }
    }
    println("After sorting:$map_with_sorted_values")

}
