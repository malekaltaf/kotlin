fun main(){
    var number = 82
    when(number){
      in  1..6 -> println("Number Between 1 to 6")
       in 7..12 -> println("Number Between 7 to 12")
        else -> println("No Number")
    }
}