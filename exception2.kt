fun main(){
    try{
        val datta = 10/0
        println(datta)
    }catch(e:Exception){
        println("something is happens")
    }finally{
        println("in finally statement")
    }
    println("after all codes")
}