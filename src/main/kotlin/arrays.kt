fun main(){

    //defining array using array constructor and built in functions
    var arr=Array<Int>(5,{i->i*1})

    //using set function
    arr.set(1,5)
    arr.set(arr.size-1 ,6)

    //using indices and get
    println("Using indices and get:")
    for(i in arr.indices){
        println(arr.get(i))
    }

    //using size and get
    println("Using size and get:")
    for(i in 0.. arr.size-1){
        println(arr.get(i))
    }
}