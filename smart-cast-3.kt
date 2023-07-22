fun main(){
    var obj:Any = "The variable obj is automatically cast to a String in this scope"
    if(obj !is String){
        print("obj is not string")
    }else{
        print("String length is ${obj.length}")
    }
}