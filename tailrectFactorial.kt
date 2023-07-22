fun main(){
    var number = 4
    var result:Long
    result = factorial(number)
    println("$number factorial is $result")
}
tailrec fun factorial(n:Int, run:Int=1):Long{
    return if(n==1){
        run.toLong()
    }
    else{
        factorial(n-1,run*n)
    }
}