fun main(){
    for (i in 1..10){
        println("for i is $i")
        if(i==5){
            continue
        }
        println("after continue")
    }
}
/*
the diffrence between continue and break is this break
will completely break the execution of the loop
while continue will 'continue' statement after 
certain defined condition
*/