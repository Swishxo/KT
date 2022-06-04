/*
 functions
 */

fun main(){
    //call the function
    displayName("Sam", "Cook")
}

//creating a function
    //parameters: take the variable and type
fun displayName(fname: String, lname: String){
    println("First name is $fname my last name is $lname")

    //must store the returned value in a variable
    val ans = add(7, 10)
    println("The numbers 7 + 10 = $ans")
}

//Create a function that returns a value
    //just like the parameter variable need a type.
    //so the function itself. its return type is Int
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}