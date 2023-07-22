fun main(){
    var birds = 1
    var fish = 2
    while(birds+fish > 1){
        birds = 3 - birds
        fish = 3 - fish
        println("$birds $fish")
    }
}