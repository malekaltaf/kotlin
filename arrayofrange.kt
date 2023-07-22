fun main(){
    var arrayof5 = arrayOf(0,1,2,3,4,5)
    for (i in 0..5){
        println(arrayof5[i])
    }
    for (i in 0..arrayof5.size-1){ // using arrayof5 size determined 6 minus by 1
        println(arrayof5[i])
    }
}