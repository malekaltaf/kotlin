fun main(){
    lableman@ for (i in 1..10){
        for(j in 1..10){
            if(i == 5){ // use variable i or j skip from loop
                continue@lableman
            }
            println("$i + $j = "+i*j)
        }
    }
}