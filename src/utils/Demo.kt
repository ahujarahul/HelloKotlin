package utils

class Demo {

    private var name : String = ""

    fun greet(name: String){
        this.name = name

        //String concat
        println("Greetings to $name \uD83D\uDE0A")

        //using string interpolation
        println("Hello ${"$name,"} welcome to Kotlin world")
    }
}