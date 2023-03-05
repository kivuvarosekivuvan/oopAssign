fun main() {
 val name=Human("Rose", 22, 50.2)
   name.eat(10)
    name.speak("I want to lose 20kgs")
       name.birthday()
 val firstName=User("Charity", "Musyoki", "chamusyoki@gmail.com", "0725694172", "fstst267vgs")
    firstName.fullName()
}

//    1. Create a class called Human withattributes: name, age, weight.
class Human(var name:String, var age:Int, var weight:Double) {

//    (a). create function eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//    and increments the human’s weight by the weight of the food eaten
//    (3 points)
    fun eat(foodWeight: Int) {
         var add=weight+foodWeight
        println("I am eating $add kgs of food")
    }

//    (b). create a function speak(speech: String) :Prints the string passed to it (2
//    points)
    fun speak(speech:String){
    var speak=speech
        println(speak)
    }

//    (c). Create a function birthday( ) :Increments the human’s age by 1 (2
//    points)
     fun birthday(){
         var newAge=++age
    println(newAge)
     }
}

//2. Create a data class User with  fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes (3 points)

data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, val password:String){
    fun fullName(){
        var full="$firstName $lastName"
        println(full)
    }





}



























