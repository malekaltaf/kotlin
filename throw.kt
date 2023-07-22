fun main(){
    validate(12)
    println("code that runs forever")
}
fun validate(age:Int){
    if(age<16){
        throw ArithmeticException("under age")
    }else{
        println("eligible for drive")
    }
}