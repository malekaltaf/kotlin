fun main(){
    smartFunction({println("first function")
},{println("second line")})

println("thi sis clo sin gin lin efu nct ion")
}

inline fun smartFunction( func1:()-> Unit, func2:()->Unit){ 
    func1()
    func2()
    println("third params")
}