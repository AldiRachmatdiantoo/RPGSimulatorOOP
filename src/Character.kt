abstract class Character(
    open var name: String?,
    open var health: Int?,
    open var level: Int?,
    open var damage: Int?,
    open var weapon: String?,
    open var type: String?
) {

    abstract fun display()
}
