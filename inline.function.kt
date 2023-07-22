fun main(){
    inlinefunction({println("this is  declare in main")})
}
inline fun inlinefunction(myfun:() -> Unit){
    myfun()
    println("this is declare in lineline function")
}