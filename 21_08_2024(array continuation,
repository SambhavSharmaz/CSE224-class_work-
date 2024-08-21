//array
fun main(){
    //array of int
    var numbers= arrayOf(1,2,3,4,5)
    //array of string
    var words: Array<String> = arrayOf("Kotlin","Java","Python")
    //array of squares using lambda function
    var squares = Array(5){i -> i*i}
    //accessing elements
    var firstno=numbers[0]
    var secondword=words[1]
    println("1st no:$firstno")
    println("2nd word:$secondword")
    words[1]="hello"
    println("modified 2nd word: ${words[1]}")
    // matrix 2x2 and 3x3
    var twodarr: Array<Array<String>> = arrayOf(arrayOf("sam","adi","shik"),arrayOf("yash","asmit","snehal"),
                                                arrayOf("yash","asmit","snehal"))
    println("${twodarr[0][0]}")
    var x: Int=100
    var y: Long = x.toLong()
    println(y)
}

//safe and unsafe cast
fun main(){
    var a = "hi"
    var b:String= a as String
    println("unsafe: $b")
    var c:String= a as Int
    println("unsafe: $c")
    var d:String= a as? Int
    println("unsafe: $d")
}
