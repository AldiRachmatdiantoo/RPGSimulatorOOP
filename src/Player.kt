class Player : Character(){
    override var name: String? = null
    override var health: Int? = 100
    override var level: Int? = 1


    override fun display() {
        println("=====PLAYER=====\nName: $name\nHealth: $health\nLevel: $level")
    }

    override fun makeChar() {
        println("\n=====CHAR PLAYER=====")
        val username = checkNullOrBlank("Masukkan Nama Anda: ")
        name = username
        display()
    }
}