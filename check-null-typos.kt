fun main(){
    var str:String? = "Hello"
    var len = if(str!=null) str.length else -1
    println("string str is $str")
    println("length of str is $len") 

    str = null
    println("string str2 is $str")
    len = if(str!=null) str.length else -1
    println("length of str2 is $len")
}