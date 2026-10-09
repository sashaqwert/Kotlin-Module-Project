
class ArchiveMenu: Menu<Archive>("Список архивов", "Создать архив", "Выход") {

    override fun create() {
        println("Введите название архива. Для отмены оставьте строку пустой.")
        val name = inp.nextLine()
        if (name != "") {
            items.add(Archive(name))
            println("Архив создан.")
        } else {
            println("Создание архива отменено")
        }
    }

    override fun procesItem(index: Int) {
        val archive = items.get(index)
        val noteMenu = NoteMenu()
        noteMenu.items = archive.notes
        noteMenu.start()
        archive.notes = noteMenu.items
        items.set(index, archive)

    }

}