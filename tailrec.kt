fun main(){
    var number = 100000.toLong()
    var result = tailrecfun(number)
    println(result)
}
tailrec fun tailrecfun(n:Long, semiresult:Long=0):Long{
    return if(n<=0){
        semiresult
    }
    else{
        tailrecfun( (n-1), n+semiresult )
    }
}