class NoteMenu: Menu<Note>("Список заметок", "Создать заметку") {

    override fun create() {
        println("Введите название заметки. Для отмены оставьте строку пустой.")
        val title = inp.nextLine()
        if (title != "") {
            println("Введите текст заметки (не более одной строки). Оставьте строку пустой для отмены")
            val text = inp.nextLine()
            if (text != "") {
                items.add(Note(title, text))
            } else {
                println("Создание заметки отменено")
            }
        } else {
            println("Создание заметки отменено")
        }
    }

    override fun procesItem(index: Int) {
        val item = items.get(index)
    }
}