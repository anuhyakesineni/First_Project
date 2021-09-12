abstract class Car {
    abstract var price: Int
    abstract fun getPrice()
}
class NewCar(price:Int): Car() {
    override var price: Int= 100
    init {
        this.price = price
    }
    override fun getPrice() {
        print(price)
    }
}
fun main(){
    val car = NewCar (100000)
}
