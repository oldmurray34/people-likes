fun main() {
    val like: Int = 61
    var textForOne: String = "человеку"
    var textForTheRest: String = "людям"

    if (like % 10 == 1) {
        println("Понравилось $like $textForOne")
    } else {
        println("Понравилось $like $textForTheRest")
    }
}