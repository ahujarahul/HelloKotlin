package utils

/**
 * Created by rahulahuja on 04/10/17.
 */
class TellTime {

    /*
    * when() is like switch() case. There is no need of break statement.
    * else is like default case in switch()
    */
    fun getTime(hour : Int) : Unit{
      when(hour){
          0, 1, 2, 3, 4 -> {
              //multiple lines in a case
              println("it is midnight")
              println("Do not disturb me")
          }// case ends

          5 -> println("good morning")
          12 -> println("good noon")
          16 -> println("good evening")
          22 -> println("good night")

          else -> println("DND i am at work")
      }//when
    }
}