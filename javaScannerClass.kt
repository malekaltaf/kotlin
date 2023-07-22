/*Program to Implement And Use Java Scanner Class in Kotlin */
import java.util.Scanner    //import java class
fun main(){ //start main function
    print("Enter Your Age:")
    val read = Scanner(System.`in`) // Declare and Intialise read Variable to use Scanner Class
    var age:Int = read.nextInt()    //Use Scanner Class by read variable
    println("Your Age is $age")
}