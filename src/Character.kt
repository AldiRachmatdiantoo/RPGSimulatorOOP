abstract class Character {
    abstract var name: String?
    abstract var health: Int?
    abstract var damage: Int?
    abstract var defense: Int?


    abstract fun display()
    abstract fun makeChar()
}