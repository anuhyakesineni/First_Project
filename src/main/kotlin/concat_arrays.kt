fun main(){
        //declaring an array
        var array1=arrayOf<Int>(1,2,3,4,5)
        var array2=arrayOf<Int>(6,7,8,9,10)
        var s =array1.size + array2.size

        //array index starts from 0
        s-=1

        //declaring empty array
        var concat_array=Array<Int>(s){0}
        var temp:Int=0

        //concatinating the 2 arrays
        for(i in array1){
            concat_array.set(temp,i)
            temp++
        }
        for(i in array2) {
            concat_array.set(temp, i)
            temp++
        }

        //printing the array
        for(i in concat_array){
            println(i)
        }
}