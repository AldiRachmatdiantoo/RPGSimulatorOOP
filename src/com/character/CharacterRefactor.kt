package com.character

class CharacterRefactor {
    var health:Int = 100
    var damage: Int = 10
    var level: Int = 1
    fun createChar(username: String, type: String, weapon: String) : Player {
        when (type) {
            "strength" -> {
                when (weapon) {
                    "swords" -> damage += 20
                    "bow" -> damage += 10
                    "gun" -> damage += 30
                }
            }
            "magic" -> {
                when (weapon) {
                    "wand" -> damage += 20
                    "magic ring" -> damage += 10
                    "gauntlet" -> damage += 30
                }
            }
        }
        return Player(username, health, level, damage, weapon, type)
    }
}