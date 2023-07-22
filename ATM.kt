/*in this program create a atm machine that can
be perform certain operations
withdrawal money and deposit money*/
fun main(){
    println("Welcome, SoAndSo Bank ATM Machine")
    println("""Please Select Your Choice
100Rs. Currency Notes 20
200Rs. Currency Notes 20
500Rs. Currency Notes 12
2000Rs.Currency Notes 4
------------------------""")
    //var amount = Integer.valueOf(readLine()) #uncomment adfer
    // print(amount)
    // defining structure variables
    var notes = arrayOf(4,12,20,20)
    // println(notes[0])
    // println(notes[1])
    // println(notes[2])
    // println(notes[3])
    var _100Rs = 100
    var _200Rs = 200
    var _500Rs = 500
    var _2000Rs = 2000
    // println(_2000Rs * notes[0])
    // println(_500Rs * notes[1])
    // println(_200Rs * notes[2])
    // println(_100Rs * notes[3])
    var T100 = _100Rs * notes[3]
    var T200 = _200Rs * notes[2]
    var T500 = _500Rs * notes[1]
    var T2000 = _2000Rs * notes[0]

    var total_amount = T100 + T200 + T500 + T2000
    println("Total Amount is $total_amount")

    print("Now, Enter Amount to Be Withdrawal :")
    var withdrawal_amount = Integer.valueOf(readLine())
    
}