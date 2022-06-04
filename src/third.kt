fun main(){
    //List: are non-mutable


    var values = listOf<Int>(8,5,4,2)

    for(i in values){
        println(i)
    }

    //print one value
    println(values.get(0))

    //get the index
    println(values.indexOf(2))

    //mutable list
    var nu = mutableListOf<String>("ioo", "yy")
    nu.add("Hi")

    //can also create a list without a specified type
    var lst = listOf("jump", "duck", "move") //have acess to the same methods



}