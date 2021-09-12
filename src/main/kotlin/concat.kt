fun main(){
    //declaring two integer arrays
    var array1=arrayOf<Int>(1,2,3,4,5)
    var array2=arrayOf<Int>(6,7,8,9,10)
    var x =array1.size + array2.size

    //declaring array
    var concat_Array=Array<Int>(x){0}
    var a:Int=0

    //concatenating the two integer arrays
    for(i in array1){
        concat_Array.set(a,i)
        a++
    }
    for(i in array2) {
        concat_Array.set(a, i)
        a++
    }

    //printing the result array
    for(i in concat_Array){
        println(i)
    }

}