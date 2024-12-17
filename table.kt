fun main() {
    val num=2 
    for( i in 1..10) {
        println(num.toString() + "x" + i + "=" +(num*i))
        //String Templating
        println("$num x $i = ${num*i}")
    }
}