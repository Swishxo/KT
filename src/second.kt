

/*
Arrays
 */


fun main() {
    //Specify type of array
    //work the same for other data types
    var num = intArrayOf(1, 2, 5, 8, 4, 34, 0)
    var arr = doubleArrayOf(3.12, 2.3, 88.033, 33.8)

    //trying to print array gives hashcode
    //println(num)

    //you loop through array to get value using range
    for (i in num) {
        println(i)
    }

    //can also change the value of array
    num[0] = 500
    println("Here is the change value " + num[0])

    //similar to the above example we can use the set method
    //input == index, value
    num.set(2, 66)
    num.set(4, 111)
    num.set(5, 999)

    for (i in num) {
        println(i)
    }

    //to get one specified element us get()
    var index = num.get(5)
    println("\nINDEX:$index")

    //get the last value
    println("Last Element " + num.last())

    //create any empty array and then set the values
    var emty = IntArray(3) //must specify the size ahead of time
    //now we can assign values
    emty.set(0, 11)
    emty.set(1, 3)
    emty.set(2, 45)

    for (i in emty) {
        println(i)
    }


    //to create any array of String or array of a class
    var str = arrayOfNulls<String>(3)
    str.set(0, "Hello")
    str.set(1, "World")
    str.set(2, "!")

    for(i in str){
        println(i)
    }

    //also get the size
    println("Size of str " + str.size)

    //create array of any elements
    var any = arrayOf(1, 6.3, "Gray", 'y')
    for(i in any){
        println("An array of anything $i")
    }



}
