import java.util.Scanner

val inp = Scanner(System.`in`)
val archives: ArrayList<Archive> = ArrayList()

fun main(args: Array<String>) {
    menu_archive_list()
}

fun menu_archive_list() {
    println("Список архивов:")
    println("0. Создать архив")
    if (archives.isEmpty()) {
        println("Список пуст")
    }
    else {
        for (i in 1..archives.size) {
            println("${i}. ${archives.get(i - 1).name}")
        }
    }
    println("${archives.size + 1}. Выход")

}