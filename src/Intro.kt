import java.util.Scanner

//the main function is the entry point to the program
fun main(){
    //variable declarations: TYPE = Value
        //var variables are mutable
    var x: Int = 3

    //$var == insert variable in text
    println("The value of x is $x")

    x = 4
    println("x is now $x")

    //Another way to assign values is keyword val
        //val variables are immutable
    val y: Int = 8
    println("The value of y is $y")

    //TYPE is not necessary it is any option. kotlin knows the type
    var name = "Steph"
    println("My name is $name")

    val age = 29
    println("My age is $age")

    //take user input as a String
    //println("Enter a word")
    //var str1 = readLine()!! //(!!) to ensure that the input value is not null
    //println("You enter $str1")

    // .toInt() function converts the string into Integer
    //println("Enter area code")
    //var code = readLine()!!
    //var areaCode: Int = code.toInt()
    //println(areaCode)

    //Same is done for other data types
    //println("What is the Pi?")
    //var input = readLine()!!
    //val ans: Double = input.toDouble()
    //println("You entered $ans")

    //Using when as a statement with else
        //when can be used as a statement with or without else branch
    println("Pick a color?")
    var color= readLine()!!

    when(color){
        "Blue" -> println("Blue is the color of the ocean")
        "Black" -> println("Black is the color of the coal")
        "Gray" -> println("Gary is the color of a wolf")
        else -> println("Not a color option")
    }

    //Using when as an expression
        //importing Scanner class might be better than readLine()
    var input = Scanner(System.`in`)
    println("Enter a month number: ")
    var month = input.nextInt()

    val userChoice = when(month){
        1 -> "January"
        2 -> "February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else -> {
            println("Not a choice")
        }
    }
    println(userChoice)









}