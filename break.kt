/*Kotlin Labeled break Expression
Labeled is the form of identifier followed by the @ sign, for example abc@, 
test@. To make an expression as label, we just put a label in front of expression.
Kotlin labeled break expression is used to terminate the specific loop. 
This is done by using break expression with @ sign followed by label name 
(break@loop).
*/
fun main(){
    for (i in 1..5){
        //println(i)
        for(j in 1..5){
            //println(j)
            if(i*j >= 10){
                break
            }
            println("$i * $j = "+i*j)
            
        }
    }
}