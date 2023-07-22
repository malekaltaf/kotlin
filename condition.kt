/*This Program Shows Kotlin if else condition Statements */
fun main(){
    var a = 20
    var b = 30
    var c = 5
    var max:Int = 0
    // write a condition that check the max number and store its value to max
    if(a>b && a>c){
        max=a
    }else if(b>a && b>c){
        max=b
    }else if(c>a && c>b){
        max=c
    }
    println("var $a $b and $c the max value is $max")
    var max2 = if(a>b) "$a is max" else "$b is max"
    println(max2)
    //write a nested if using zoo and rain example
    /*
    write condition
    $$ if there is rain we did not go outside $$$
    $$ if there is notrain outside we should go to zoo $$$
    $$ if we want to go zoo choose if we use bus or car $$$
    $$ finally print statement weather we go zoo or not : $$$
    $$ or if we go to zoo if we use bus or car $$$
    */
//------------------------------------------
    // var zoo:Boolean
    // true || going to zoo
    // false || not going to zoo
    var rain:Boolean 
    // true >> rain is started
    // false >> day is clean
    var veh:Boolean
    // true ;; by bus
    // false ;; by car
//\\-------------------------------------------
    //-----------------------------
        rain=false //change value to take effect
        veh=false    //check vehicle
    //------------------------------
    var gooo = "We Should Go To Zoo and"
    var WeShouldGO:String = if(rain){
        "We Did Not GO Zoo Reason By Rainfall"
    }else{
         if(veh){
            gooo+"Go using bus to travel"
        }else{
            gooo+"Go using car by travel"
        }
    }
    println(WeShouldGO)
}