fun main(){
    var number = 5
    var result:Long 
    result = factorial(number)
    println("$number factorial is $result")
}
fun factorial(n:Int):Long{
    return if(n==1){
        n.toLong()
    }else{
        n*factorial(n-1)
    }
}