import com.sun.tools.javac.jvm.Items

/**
 * Created by rahulahuja on 30/05/18.
 */
fun main(args: Array<String>){

    //high order functions
    val arr = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val filtered = arr.filter { it > 5 }
    println(filtered)

    val doubledArr  = arr.map { it.times(2) }
    println(doubledArr)

    //normal function
    fun printMessage(message: String) {
        println("Message is $message")
    }

    printMessage("Hello Function")

    //lamda function
    val printMsg = { msg: String, from:String ->
        println("Message is $msg from $from")
    }
    printMsg("Hello Lamda", "Kotlin")

    fun showMessage(callback: (String) -> Unit){
        callback("Yo yo")
    }

    showMessage({
        println("Callback $it")
    })



}