// For Loops
fun main() {
    println(".. :")
    for(i in 1..5){
    println(2*i)}
    println("Until :")
    for(i in 1 until 5){
    println(4*i)}
    println("downTo :")
    for(i in 8 downTo 2 step 2){
    println(6*i)}
    println("with arrayOf :")
    val fruits= arrayOf("apple","banana","orange")
    for(fruit in fruits){
        println("${fruit}")
    }
    println("with listOf :")
    val fruitss= listOf("apple ","banana ","orange ")
    for(fruitsss in fruitss.indices){
        print("${fruitss[fruitsss]}")
    }
    var i = 5
    while(i>0)
    println(i)
    i--
    var i= 5
    do{
        print("$i ")
        i--
    }
    while(i>0)
    var i= 1
    do{
        print("$i ")
        i++
    }
    while(i<=5)
    fun demo() {
    println("Before [in the demo fun]")
    println("hi")
    println("After [in the demo fun]")
}
fun main() {
    println("Before demo")
    demo()
    println("After demo")
}
}
