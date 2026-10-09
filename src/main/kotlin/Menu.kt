abstract class Menu<T: Menunable> (val title: String, val fisst_element: String, val back: String = "Назад") {

    var items: ArrayList<T> = ArrayList()  // var, чтобы можно было заменить во втором меню

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
        println("${items.size + 1}. $back")
    }

    open fun create() {
        println("Создание не поддерживается!")
    }

    fun start() {
        while (true) {
            printMenu()
            println("Введите пункт меню (Например, \"1\")")
            val line = inp.nextLine()
            var d: Int
            try {
                d = line.toInt()
            } catch (_: Exception) {
                println("Некорректный ввод. Ожидается число.")
                continue
            }
            if (d == 0) {
                create()
            } else if (d == items.size + 1) {
                break // Назад
            } else if (d < 0 || d > items.size + 1) {
                println("Такого пункта меню нет. Попробуйте ещё раз...")
                continue
            } else {
                procesItem(d - 1)
            }
        }

    }

    abstract fun procesItem(index: Int)

}