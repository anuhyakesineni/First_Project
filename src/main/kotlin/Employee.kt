class Employee() {
    var name:String?=null
    var age:Int?=null
    var designation:String? =null
    var company_name:String? = null
}
fun main(){

    //using apply function
    Employee().apply{
        //initializing values
        name = "Sai Anuhya"
        age = 21
        designation = "Intern"
        company_name = "PurpleTalk"
        println("Employee-1:")
        println(name)
        println(age)
        println(designation)
        println(company_name)
        println("Employee 1 details are created using \'apply' function")
    }

    //using with function
    var obj1 = Employee()
    var emp_no:String= with(obj1){

        name = "Hari"
        age = 21
        designation = "Intern"
        company_name = "PurpleTalk"
        "Employee 2 details are created using \'with' function"
    }
    println("Employee-2:")
    println(obj1.name)
    println(obj1.age)
    println(obj1.designation)
    println(obj1.company_name)
    println(emp_no)

    //using let function
    emp_no=Employee()?.let {
        it.name = "Anusha"
        it.age = 21
        it.designation = "Intern"
        it.company_name = "PurpleTalk"

        println("Employee-3:")
        println(it.name)
        println(it.age)
        println(it.designation)
        println(it.company_name)
        "Employee 3 details are created using \'with' function"
    }
    println(emp_no)

    //using run function
    emp_no= Employee().run {
        name = "Prasad"
        age = 21
        designation = "Intern"
        company_name = "PurpleTalk"

        println("Employee-4:")
        println(name)
        println(age)
        println(designation)
        println(company_name)
        "Employee 4 details are created using \'with function"
    }
    println(emp_no)

}