/* create basic calculator using when expression in kotlin */
fun main(){ // start main function
    print("1:")
    var f1:Int = Integer.valueOf(readLine()) // get value one from user
    print("2:")
    var s1:Int = Integer.valueOf(readLine()) // get value too from user
    println(
"""1. Addition
2. Substraction
3. Multiplication
4. Division""")
    var d1:Int = Integer.valueOf(readLine()) // get choice of operation
    var result = when(d1){  // assign to when expression
        1 -> f1+s1
        2 -> f1-s1
        3 -> f1*s1
        4 -> f1/s1
        else -> 0
    }
    print("Your Answer: "+result) // show to final o/p
}