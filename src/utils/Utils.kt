package utils

import models.Person

fun loopTheRange(intRange: IntRange) {
    for (i in intRange){
        println("range list : $i")
    }
}

fun loopProgression(intProgression: IntProgression) {
    for (i in intProgression){
        println("progression list : $i")
    }
}

fun iterateTheList(list: ArrayList<String>) {
    for (str in list) println("string list : $str")
}

fun displayPersonInfo(personObj: Person) {
    println("\nPerson info from data class : ")
    println(personObj.toString())

    println("\nto demonstrate setter functionality in kotlin as below : Object gets modified.")
    personObj.age = 65
    personObj.isRetired = true
    println(personObj.toString())

    println("\nto demonstrate copy() functionality in kotlin as below : ")
    val personCopy = personObj.copy(name = "Rahul Ahuja", salary = 60000.0)
    personCopy.isRetired = false
    println(personCopy.toString())


    println("\noriginal Person info : ")
    println(personObj.toString())
}

fun getStringDetails(string2: String) {
    //some functions of String class
    println("in getStringDetails() -- ")
    println("reverse : "+string2.reversed())
    println("concat : "+string2.plus( " concat string"))
    println("concat : "+string2.plus( 123))
    println("char at : "+string2[3])
    println("char at : "+ string2[3])
    println("length : "+string2.length)
    println("equals : "+string2.equals("hello", true))
    println("caps first letter : "+string2.capitalize())
    println("decaps first letter : "+string2.decapitalize())
    println("compare to : "+string2.compareTo("This is not a const", true))
    println("drop : "+string2.drop(4))
    println("drop last : "+string2.dropLast(4))
    println("ends with : "+string2.endsWith("stRIng",true))
    println("String immutable in Kotlin : $string2")
}

fun displayName(name: String) {
    println("in function displayName() -- Name is : $name")
}