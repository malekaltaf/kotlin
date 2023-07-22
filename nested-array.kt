fun main(){
    var ar1 = arrayOf(5,4,1,2,3,6,7)
    var ar2 = arrayOf(1,0,2,2,0)
    try {
        for(i in ar1.indices){
            try{
                println(ar1[i].toString() + " is divide by " + ar2[i].toString() + " is equals to " + ar1[i]/ar2[i])
            }catch(exc:ArithmeticException){
                println("Can not Divided By-Zero")
            }
        }
    }catch(exc:ArrayIndexOutOfBoundsException){
            println("element was not found")      
    }
}