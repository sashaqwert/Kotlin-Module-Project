class Archive (val name: String) : Menunable {
    var notes: ArrayList<Note> = ArrayList()
    override fun menu_name(): String {
        return name
    }
}