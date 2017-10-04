package utils

/**
 * Created by rahulahuja on 04/10/17.
 */
class FindMax(num1 : Int, num2 : Int){

    var a : Int = 0
    var b : Int = 0

    init {
        a = num1
        b = num2
    }

    /*
     * if else condition as expression. It is called if as expression.
     * By default last statement in if or else will be returned
     */
    fun getMax() : Int{
        return if (a > b){
            //println("$a is greater")
            a
        }else{
            //println("$b is greater")
            b
        }
    }

    /*
    * var return = if (a > b){
            //println("$a is greater")
            a
        }else{
            //println("$b is greater")
            b
        }
     */
}