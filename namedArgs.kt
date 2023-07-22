/*Named Argument
A named argument is an argument in which we define the name of argument 
in the function call. The name defined to argument of function call checks 
the name in the function definition and assign to it. */

fun main(){
    run(u="c")
}
fun run(n:Int=4, u:String){
    println("this is run $u")
}