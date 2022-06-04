/*
    OOP
 */

import java.util.Scanner
fun main(){
    var read = Scanner(System.`in`)
    println("Enter a name")

    //creating a person obj
    var student = Person()

    student.name = read.next()
    println("Enter your age")
    student.age = read.nextInt()

    print("Hello my name is ${student.name} and my age is ${student.age}")

}
