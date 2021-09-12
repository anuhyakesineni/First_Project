fun pow(x:Int, y:Int):Int{
    var p1 = 1
    for( i in 1..y)
        p1 =p1*x
    return p1
}
fun main(){
    var power = pow(2,3)
    print(power)
}