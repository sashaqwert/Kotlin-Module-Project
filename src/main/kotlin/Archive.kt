class Archive (val name: String) : Menunable {
    val notes: ArrayList<Note> = ArrayList()
    override fun menu_name(): String {
        return name
    }
}