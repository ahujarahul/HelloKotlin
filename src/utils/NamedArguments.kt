package utils

/**
 * Created by rahulahuja on 17/04/18.
 */
class NamedArguments {

    fun build(title: String, width: Int = 800, height: Int = 600) {
        println("Details --> $title :: Height --> $height :: Width :: $width")
    }
}