fun main(){

        var arr = arrayOf(1,4,3,2,4,6,5,3)

        var max_ele = 0
        //finding the largest element in the array
        for (i in arr) {
            if (max_ele < i) {
                max_ele = i
            }
        }
        println("Largest element in the array is $max_ele")

}
