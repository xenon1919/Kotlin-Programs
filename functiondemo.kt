fun main() {
    val result =add(5,5)
    println(result)
    val result2= add(19,10) 
    println(result2)
    evenOrOdd(5)
    evenOrOdd(4)
    val ans = product(2,5)
    println(ans)
}
fun add(num1:Int,num2:Int):Int {
    val sum=num1+num2
    return sum
}
fun evenOrOdd(num1:Int) {
    val result= if(num1%2==0) "Even" else "Odd"
    println(result)
}
fun product(num1:Int,num2:Int) = num1*num2