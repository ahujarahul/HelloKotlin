/**
 * Created by rahulahuja on 30/05/18.
 */
fun main(args: Array<String>){

    fun <T> printValue(value: T){
        println("value is --> $value")
    }

    printValue(3.5)
    printValue(3)
    printValue("Rahul")
}