class Coffee constructor(coffeeType: String, isHot: Boolean){

    var coffee = " "
    var drinkIs = false

    //execute immediately after the primary constructor
    init{
        println("Message From init: Variable coffeeType created")
        println("Message From init: Boolean isHot created")

        //also can initialize variables
        coffee = coffeeType
        drinkIs = isHot
    }
    fun test(){
        println("Coffee created $coffee")
        println("Coffee Hot: $drinkIs")

    }
}