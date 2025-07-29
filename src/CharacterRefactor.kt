class CharacterRefactor {
    var health: Int = 100
    var damage: Int = 10
    var level: Int = 1
    fun createChar(username: String, type: String, weapon: String) : Player{
        when (type) {
            "strength" -> {
                when (weapon) {
                    "swords" -> damage += 50
                    "bow" -> damage += 40
                    "shield" -> health += 60
                }
            }
            "magic" -> {
                when (weapon) {
                    "wand" -> damage += 60
                    "magic ring" -> damage += 40
                    "gauntlet" -> {
                        health += 60
                    }
                }
            }
        }
        return Player(username, health, level, damage, weapon, type)
    }
}