
/*
 Constructor
 */

//the primary constructor
    //design to be next to the class name
    //designed the same way as functions
class Human constructor(profession: String, hobby: String){

    var job = profession
    var passTime = hobby

    fun work(){
        println("I work as a $job")
    }

    fun favoriteThing(){
        println("My favorite thing to do is $passTime")
    }
}
fun main(){

    var person = Human("Software Dev", "Code")

    person.work()
    person.favoriteThing()
}