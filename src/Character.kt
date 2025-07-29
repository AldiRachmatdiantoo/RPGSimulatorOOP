abstract class Character(
    var name: String?,
    var health: Int?,
    var level: Int?,
    var damage: Int?,
    var weapon: String?,
    var type: String?
) {

    abstract fun display()
}
