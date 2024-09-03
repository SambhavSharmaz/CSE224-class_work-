// Arithmetic , Assignment, Logical, Operators
fun main() {
    var a=10
    var b=10
    var c= null
    var tru= true
    var fal= false
    var add=a + b
    println("add : $add")
    println("sub : ${a-b}")
    println("multi : ${a*b}")
    println("div : ${a/b}")
    println("mod : ${a%b}")
    if (a==5){
        println(tru)
    }
    else{
        println(fal)
    }
    println("greater than: ${a>b}")
    println("less than: ${a<b}")
    println("greater than equal to: ${a>=b}")
    println("less than equal to: ${a<=b}")
    println("equals to: ${a==b}")
    println("not equals to: ${a!=b}")
    println("null: ${c}")
    a=a+b
    println("$a")
    a=a-b
    println("$a")
    b=b*a
    println("$b")
    a=a/b
    println("$a")
    a=a%b
    println("$a")
    +a
    println("$a")
    -a
    println("$a")
    ++a
    println("$a")
    --a
    println("$a")
    // !a
}
