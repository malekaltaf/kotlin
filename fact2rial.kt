fun main(){
    var number = 10
    var rs2 = reFact(number)
    println(rs2)

}
fun reFact(n:Int):Long{
    return if(n==1){
        n.toLong()
    }else{
        n*reFact(n-1)
    }
}