// condition check month and display season using when expression
// We can use multiple branches of condition separated with a comma. It is used, when we need to run a same logic for multiple choices.
fun main(){
    var month = 10 // from 1 to 12 months
    // 1 to 4 winter ; 5 to 8 summer ;; 9 to 12 moonson
    when(month){
        1,2,3,4 -> println("Winter Season")
        5,6,7,8 -> println("Summer Season")
        9,10,11,12 -> println("Moonson Season")
        else -> println("No Season")
    }
}