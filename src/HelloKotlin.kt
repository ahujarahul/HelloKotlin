import models.Person
import utils.Addition
import utils.FindMax
import utils.NamedArguments
import utils.TellTime

/**
 * Created by rahulahuja on 15/09/17.
 */

//All variables, when declared, should be initialized in Kotlin

//This is a Kotlin function which will return void (Unit)
fun main(args : Array<String>) : Unit {
    print("print() will not go to a new line.")
    println("println() will go to a new line.")

    //Variable declaration and assignment of value
    var string1 = "This is sample string variable and it is not a constant."

    //declaring variable
    var string2: String? = null
    string2 = "This is not a constant"
    println("String2 : "+ string2)

    //getStringDetails(string2)

    val string3 = "this is a constant string and cannot reassigned"
    //string3 = "reassign constant strings' value generates error"

    var name : String = "Rahul"
    displayName(name)

    var demoObj = Demo()
    demoObj.greet("Ray")

    val personObj = Person(name, 25, 50000.0, false)
    displayPersonInfo(personObj)

    //object creation and method calling
    var addObj = Addition()
    val addition = addObj.addTwoNumbers(50, 20)
    println("Addition is : "+addition)

    //string interpolation
    var num1 = 20
    var num2 = 40
    println("Addition is --> ${num1 + num2}")

    //single expression function
    fun multiply(x : Int) : Int = x.times(2)
    println("single expression function --> ${multiply(5)}")

    //closure or function as a variable
    val multi: (Int) -> Int = ::multiply
    println("closure or function as a variable --> ${multi(3)}")

    //function as a parameter
    fun MultiplyAsParam(operation: (Int) -> Int, x: Int){
        println("Function as Parameter --> ${operation(x)}")
    }
    MultiplyAsParam(multi, 8)


    //Null safety
    var designation : String? = null
    println("Designation Count --> ${designation?.count()}")

    //Elvis operator --> ?:
    designation?.let {
        println("Designation Count --> ${designation?.count()}")
    } ?: println("Designation Count --> 0")

    designation = "Manager"

    //it keyword --> it is like current object on which operation is going on
    designation.let {
        println("Designation is --> $it")
    }

    //Named Arguments
    var genericMethod = NamedArguments()
    genericMethod.build(title = "Rameez", height =  6, width = 2)
    genericMethod.build(height =  5, width = 1, title = "Rahul")


    val personName = "Ricky"
    val personObj2 = Person(personObj, personName)
    println("\nAnother Person object : "+ personObj2.toString())


    val findMax = FindMax(5 , 2)
    println("\nmax value : "+ findMax.getMax())

    val tellTime = TellTime()
    tellTime.getTime(1)

    var list = ArrayList<String>()
    list.add("Hello")
    list.add("from")
    list.add("the")
    list.add("world")
    list.add("of")
    list.add("Kotlin")
    list.add("Collections")

    iterateTheList(list)

    //print alternate numbers
    var intProgression : IntProgression = 1..10 step 2
    loopProgression(intProgression)

    //print range
    var intRange : IntRange = 1..5
    loopTheRange(intRange)

    var intReverse : IntProgression = 5 downTo  1
    loopProgression(intReverse)
}

fun loopTheRange(intRange: IntRange) {
    for (i in intRange){
        println("range list : "+ i)
    }
}

fun loopProgression(intProgression: IntProgression) {
    for (i in intProgression){
        println("progression list : "+ i)
    }
}

fun iterateTheList(list: ArrayList<String>) {
    for (str in list){
        println("string list : "+ str)
    }
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

class Demo {

    var name : String = ""

    fun greet(name: String){
        this.name = name

        //String concat
        println("Greetings to $name \uD83D\uDE0A")

        //using string interpolation
        println("Hello ${name + ","} welcome to Kotlin world")
    }
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
    println("String immutable in Kotlin : "+string2)
}

fun displayName(name: String) {
    println("in displayName() -- Name is : "+ name)
}

/*
* data types in Kotlin :
* Boolean   1 bit
* Byte      8 bits
* Char      16 btis
* Short     16 bits
* Int       32 bits
* Long      64 bits
* Float     32 bits     for 50.0 to be float, we must say 50.0f
* Double    64 bits     by default : 50.0 is considered as Double
*
* all types have first letter in caps because in Kotlin, data types are class and variable becomes an object.
*/

/*
* run by clicking Kotlin icon beside main()
* Run > HelloKotlinKt
* 'HelloKotlinKt' is the class file which is generated by Kotlin as we have not written class in our program.
* This class file can be found in 'out' folder generated after compilation.
* on success, the code exits with exit code 0.
*/