fun main() {  
    val nume = intArrayOf(4, 8, 16, 32, 64, 128, 256, 512)  
            //array numb  0, 1, 2, 3, 4, 5, index out of bound exception
    val deno = intArrayOf(2, 0, 4, 4, 0, 8)  
    try {  
        for (i in nume.indices) {  
            try {  
                println(nume[i].toString() + " / " + deno[i] + " is " + nume[i] / deno[i])  
            } catch (exc: ArithmeticException) {  
                println("Can't divided by Zero!")  
            }  
  
        }  
    } catch (exc: ArrayIndexOutOfBoundsException) {  
        println("Element not found.")  
    }  
} 