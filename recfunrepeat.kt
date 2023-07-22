fun main(){
    CalcLater()
}
fun CalcLater(){
    println("""1. Continue
Anything Else. Exit""")
    var ch1 = Integer.valueOf(readLine())
    if(ch1==1){
        print("Enter 1st No. : ")
        var f1 = Integer.valueOf(readLine())
        print("Enter 2nd No. : ")
        var f2 = Integer.valueOf(readLine())
        var f3 = f1+f2
        println("Sum of $f1 and $f2 is = "+f3)
        println("""
|---------------------------|
|-- $f1 + $f2 ------ == $f3 |
|---------------------------|
""")
        CalcLater()
    }
}