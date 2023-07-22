fun main(){
   loop@  for(i in 1..3){
          for(j in 1..3){
            println("i $i ++ j $j")
            if(i == 2){
                break@loop
            }
            
        }
    }
}
/*
In the above example, when the value of i became 2 and satisfy the 
if condition which execute break expression followed by labeled name. 
The break expression followed by labeled name terminates the body of 
label identifier.
 */