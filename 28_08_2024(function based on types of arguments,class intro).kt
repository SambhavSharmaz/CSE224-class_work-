//will work
fun sum(a:Int =10,b:Int=20) {
    var c=a+b
    println(c)
}
fun main() {
    sum(20,50)
    sum()
}
//wont work due no value passed for parameter 'a' and 'b'
fun sum(a:Int,b:Int) {
    var c=a+b
    println(c)
}
fun main() {
    sum(20,50)
    sum()
}
fun sum(a:Int,b:Int):Int {
    val c = a+b
    return c
}
fun main() {
    val a =10
    val b =20
    val res =sum(a,b)
    println(res)
}
// celsius to fahrenheit
fun ctof(c:Int):Int {
    val f = (9/5 * c) + 32
    return f
}
fun main() {
    val c =10
    val res =ctof(c)
    println(res)
}
// fahrenheit to celsius  
fun ftoc(f:Int):Int {
    val c = (f - 32) * 5/9
    return c
}
// find factorial
fun fact(n:Int): Int {
    if(n<=1) return 1
    else{
        return n*fact(n-1)
    }
}
fun main(){
    print("Enter a number: ")
    var n= readln().toInt()
    println("Factorial of $n is: ${fact(n)}")
}
fun main() {
    val f =200
    val res =ftoc(f)
    println(res)
}
//class intro
class stu{
    fun res(){
        print("pending")
    }
}
fun main(){
    var s1 =stu()
    s1.res()
}
