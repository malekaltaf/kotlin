// We can use multiple statement enclosed within block of condition.
fun main(){
    var number = 5
    when(number){
        1 -> {
            println("Monday")
            println("First, day of week")
        }
        7 -> {
            println("Sunday")
            println("Last, day of week")
        }
        else -> {
            println("unknown day")
            println("unknown, day of week")
        }
    }
}