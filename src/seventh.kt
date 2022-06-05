
//parent class must use keyword "open" to be inherited from
open class Animal constructor(n: String, w: Int, s: String){

    //properties
    var name = n
    var weight = w
    var sound = s

    //functions of the parent class also must use the keyword "open"
    open fun sound(){
        println("$name made a sound!")
    }

}


/*
just like variables you use must specify
the type the child class is inheriting from

type == parent class. Also, child class must resemble parent class constructor
to gain access to parent class variables and functions
 */

class Dog constructor(name: String, weight: Int, sound: String): Animal(name, weight, sound){

    fun action(){
        println("$name is wagging his tail!")
    }

}

fun main(){

    val begale = Dog("Ryse", 29, "Bark")

    //call parent class function ---> (Animal class)
    begale.sound()

    //call function from child class ---> (Dog class)
    begale.action()

    val huskie = Dog("Jupiter", 70, "Howls")
    huskie.sound()
    huskie.action()
}