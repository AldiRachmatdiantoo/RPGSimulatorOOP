class Enemy : Character(){
    override var name: String? = null
    override var health: Int? = 100
    override var level: Int? = 1


    override fun display() {
        println("=====ENEMY=====\nName: $name\nHealth: $health\nLevel: $level")
    }

    override fun makeChar() {
        println("\n=====CHAR ENEMY=====")
        val username = checkNullOrBlank("Masukkan Nama Enemy: ")
        name = username
        display()
    }
}