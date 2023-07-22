/*Program for understanding String and Arrays in Kotlin */
fun main(){
    var color = arrayOf("red","blue","green","yellow","purpal","orange","mist")
    var sound = Array(5,{i -> i*2 }) // assign 'array()' using
    // for (x in color){
    //     println(x) //print every color 
    // }
    // for (x in sound){
    //     println(x) //print every array variable
    // }
    var first1 = sound[0]
    var last1 = sound[sound.size-1]
    var sizeColor = color.size // lenght of an array
    // below is example for raw string (use by """ quotes)
    println(
""" $first1         
            $last1      
                    $sizeColor """
    )   
}