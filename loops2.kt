fun main(){
    var marks = arrayOf(39,42,45,52,48,62,81,25,43,51)
    for (item in marks.indices) // The elements of an array are iterated on the basis of indices (index) of array. For example:
    println("marks[$item]: "+marks[item])

    /*
    
>>> for (i in 1..5) print(i)
for (i in 1..5) print(i)12345
>>> for (i in 5..1) print(i)
for (i in 5..1) print(i)
>>> for (i in 5 downTo 1) print(i) // use DownTo for Reverse 
for (i in 5 downTo 1) print(i)54321
>>> for (i in 5 downTo 2) print(i)
for (i in 5 downTo 2) print(i)5432
>>> for (i in 1..5 step 2) print(i) // use step for remove from list
for (i in 1..5 step 2) print(i)135
>>> for (i in 5 downTo 1 step 2) print(i)
for (i in 5 downTo 1 step 2) print(i)531
>>>    
    */
}