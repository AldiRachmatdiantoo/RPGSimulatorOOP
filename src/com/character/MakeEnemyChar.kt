package com.character

import kotlin.random.Random

class MakeEnemyChar {
    var health:Int = 100
    var damage: Int = 10
    var level: Int = 1

    lateinit var username: String
    lateinit var type: String
    lateinit var weapon: String

    fun makeEnemyChar(): Enemy {
        val listName = mutableListOf("diana", "felli", "keysha", "robert", "ethan")
        val listType = mutableListOf("strength", "magic")
        val listStrengthWeapon = mutableListOf("swords", "bow", "gun")
        val listMagicWeapon = mutableListOf("wand", "magic ring", "gauntlet")

        while (true){
            //username
            val usernameIndex = Random.nextInt(0, listName.size)
            username = listName[usernameIndex]

            //type
            val typeIndex = Random.nextInt(0, listType.size)
            type = listType[typeIndex]

            when(type){
                "strength" -> {
                    val weaponIndex = Random.nextInt(0, listStrengthWeapon.size)
                    weapon = listStrengthWeapon[weaponIndex]
                    logicWeapon(weapon)
                    break
                }
                "magic" -> {
                    val weaponIndex = Random.nextInt(0, listMagicWeapon.size)
                    weapon = listMagicWeapon[weaponIndex]
                    logicWeapon(weapon)
                    break

                }
            }

        }
        return Enemy(username, health, level, damage, weapon, type)

    }
    fun logicWeapon(weapon: String){
        when(type){
            "strength" -> {
                when(weapon) {
                    "swords" -> damage += 20
                    "bow" -> damage += 10
                    "gun" -> damage += 30
                }
            }
            "magic" -> {
                when(weapon){
                    "wand" -> damage += 20
                    "magic ring" -> damage += 10
                    "gauntlet" -> damage += 30
                }
            }
        }
    }
}