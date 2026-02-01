open class Menu (val title: String, val fisst_element: String, val back: String = "Назад") {

    fun printTopMenu() {
        println(title)
        println("0. $fisst_element")
    }

    open fun printMenu() {
        printTopMenu()
    }
}