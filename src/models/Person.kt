package models

/**
 * Created by rahulahuja on 04/10/17.
 */
//
/*
* This is equivalent to model/ POJO class in Java
* When we specify the data keyword in our class definition, Kotlin automatically generates field accessors,
* hashCode(), equals(), toString(), as well as the useful copy() and componentN() functions (more on these later).
* Any of the functions above which are manually defined by us in the class will not be generated.
*
* Below syntax defines a data class with parametrized constructor.
* Here, name is read-only field as it is val (constant) i.e Kotlin will not provide setter method for this field
* salary field uses visibility modifier 'private' which will not allow access to it outside this class.
*
* data classes are immutable
*/
data class Person (val name : String, var age : Int, private var salary : Double, var isRetired : Boolean){

    //override default toString()
//    override fun toString(): String {
//        return "Person(Person name='$name', Person age=$age, Person salary=$salary, Person isRetired=$isRetired)"
//    }

    /*
    * If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor.
    * Delegation to another constructor of the same class is done using the this keyword
    */
    constructor(person : Person, name: String) : this(name, person.age, person.salary, person.isRetired){
        //code
    }
}