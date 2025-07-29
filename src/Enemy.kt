class Enemy(name: String?,
             health: Int?,
             level: Int?,
             damage: Int?,
             weapon: String?,
             type: String?
)
    : Character(
    name,
    health,
    level,
    damage,
    weapon,
    type
) {
    override fun display() {
        println("=====ENEMY=====")

        println(
            "Name: ${name}\t\tHealth: $health\t\tLevel: $level" +
                    "\nDamage: $damage\t\tType: $type\t\tWeapon: $weapon"
        )
    }
}