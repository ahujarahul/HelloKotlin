package utils

/**
 * Created by rahulahuja on 15/09/17.
 */
/*
* A class in Kotlin can have a primary constructor and one or more secondary constructors.
* The primary constructor is part of the class header: it goes after the class name. (here we give default constructor)
*
* If the primary constructor does not have any annotations or visibility modifiers,
* the constructor keyword can be omitted. The primary constructor cannot contain any code.
*
* If a non-abstract class does not declare any constructors (primary or secondary), it will have a
* generated primary constructor with no arguments.
* */
class Addition{

    //write below block to init values into local var from constructor
    init {
        println("\ninside init block")
    }

    fun addTwoNumbers(num1 : Int, num2 : Int) : Int {
        return num1 + num2
    }

}