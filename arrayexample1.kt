fun main(){
    var arrayelem = Array<Int>(5){0}
    arrayelem[0] = 10
    arrayelem[3] = 15
    for (i in arrayelem){
        println(i)
    }
}