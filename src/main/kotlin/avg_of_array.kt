fun main(){
    var arr=arrayOf<Int>(1,2,3,4,5,6,7,8);
    var sum=0;
    for(i in arr){
        sum+=i
    }
    //average of the array
    var avg= sum/ arr.size
    println("The average of the array is $avg")

}