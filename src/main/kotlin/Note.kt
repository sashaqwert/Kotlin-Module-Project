class Note (val title: String, val content: String) : Menunable {
    override fun toString(): String {
        return "Название: \"$title\", текст: \"$content\"."
    }

    override fun menu_name(): String {
        return title
    }
}