fun main(){
    val a = 10  
    val b = 5  
    val myString = """value $a  
        |is greater than value $b  
    """.trimMargin()  
    // println(myString)
    println("${myString.trimMargin()}")
}