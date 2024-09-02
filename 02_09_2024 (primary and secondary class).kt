//The primary constructor initializes the class, while the secondary constructor is used to initialize the class and introduce some extra logic
//Secondary Constructor
class person{
    var name: String
    var age: Int
constructor(x:String,y:Int){
    this.name=x
    this.age=y
}
constructor(x:String){
    this.name=x
    this.age=12
}
constructor(){
    this.name="Syyam"
    this.age=10
}
fun intro(){
    println("My name is $name and age is $age")
}
}
fun main(){
    var a= person()
    a.intro()
    var b= person("Ram",15)
    b.intro()
    var c= person("Sham")
    c.intro()
}
//Primary Constructor
class Person(var name: String, var age: Int) {
    constructor(name: String) : this(name, 0)
    constructor() : this("Ram", 12)

    fun intro() {
        println("My name is $name and my age is $age")
    }
}

fun main() {
    val a = Person()
    a.intro()
    
    val b = Person("Sham")
    b.intro()
    
    val c = Person("Ham", 19)
    c.intro()
}
//area of square and rectangle
open class rec(var a:Double; var b:Double){
    fun area();Double{
        return a*b
    }
    open fun display{
        println("area is ${area()}")
    }
}
class sqa(var a:Double; var b:Double){
    override fun display{
        println("area is ${area()}")
    }
}
