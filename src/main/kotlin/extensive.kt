fun main(args: Array<String>) {
    fun Int.fib() {
        var f0 : Int = 0
        var f1 : Int =1

        //printing the first two terms
        print("$f0\t$f1\t")
        var count = 2
        var f2 : Int
        while(true){
            count++
            f2 = f0 +f1
            print("$f2\t")

            //checking the no.of terms
            if(count == this)
                break
            //re-assigning the values
            f0=f1
            f1=f2
        }

    }

    println("Enter the no.of terms:")
    //reading n
    var n = Integer.valueOf(readLine())
    n.fib()

}
