fun printmessage(message:String, prefix:String = "Info"): Unit{
    println("$prefix, $message")
}

// Soma
fun sum(x:Int, y:Int): Int{
   return x + y
}

//line function
fun soma(x:Int, y:Int) = x*y

fun main(){
    printmessage("Hello", "world!")
    println(sum(1,2))
    println(soma(1,2))
}