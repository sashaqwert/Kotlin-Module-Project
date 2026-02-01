open class Menu<T: Menunable> (val title: String, val fisst_element: String, val back: String = "Назад") {

    protected val items: ArrayList<T> = ArrayList()

    fun printTopMenu() {
        println(title)
        println("0. $fisst_element")
    }

    fun printMenu() {
        printTopMenu()
        if (items.isEmpty()) {
            println("Список пуст")
        }
        else {
            for (i in 1..items.size) {
                println("${i}. ${items.get(i - 1).menu_name()}")
            }
        }
        println("${items.size + 1}. Выход")
    }

    open fun create() {
        println("Создание не поддерживается!")
    }

    fun start() {
        while (true) {
            printMenu()
            //TODO: Вввод
        }
    }
}