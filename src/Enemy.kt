class Enemy : Character(){
    override var name: String? = null
    override var health: Int? = 100
    override var damage: Int? = null
    override var defense: Int? = null


    override fun display() {
        println("=====PLAYER=====\nName: $name\nHealth: $health\nDamage: $damage\nDefense: $defense")
    }

    override fun makeChar() {
        println("\n=====CHAR ENEMY=====")
        val username = checkNullOrBlank("Masukkan Nama Enemy: ")
        name = username
        display()
    }
}