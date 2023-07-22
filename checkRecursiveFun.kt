/* thisIsProgramThatCallItSelfFunction */
fun main(){
    writeSomething()
}
fun writeSomething(){
    if(true){
        println("This is Something...")
        writeSomething()
    }
}