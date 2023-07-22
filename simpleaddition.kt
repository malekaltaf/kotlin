fun main(){
    println("""1. continue
2. exit""")
    var chose:Int = Integer.valueOf(readLine())
    // print(chose)2
    while(chose==1){
        println("Addtion is Perform")
        println("Please Enter 1st Number ")
        var first:Int = Integer.valueOf(readLine())
        println("Please Enter Last Number ")
        var last:Int = Integer.valueOf(readLine())
        println("Sum of $first and $last is "+(first+last))
        break
    }
}