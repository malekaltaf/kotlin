fun main(){
    var array1 = arrayOf("mahes","cat",12,49,"hey596")
    println("before change")
    for(i in array1){
        println(i)
    }
    println("after change")
    array1[3] = "Cyber Punk"  // using index no
    array1.set(0,2077) //using set() function
    for(i in array1){
        println(i)
    }
}