fun main(){
    try{
        var data = 5/0
        println(data)
    }catch(e:ArithmeticException){
        println(e)
    }finally{
        println("finally block always execute")
    }
    println("below code...")
}