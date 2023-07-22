var count=0
fun main(){
    finite()
}
fun finite(){
    count++
    if(count<=5){
        println("hello $count")
        finite()
    }
}