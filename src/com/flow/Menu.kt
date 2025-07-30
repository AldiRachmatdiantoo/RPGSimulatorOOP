package com.flow
import com.character.Enemy
import checkFilterList
import com.character.Player

class Menu() {

    fun checkMenuList(enemy: Enemy, player: Player): Boolean {
        val listMenu = mutableListOf("attack", "defense", "cek status lawan", "menyerah")
        val choose = checkFilterList("Pilih: ", listMenu)
        when (choose) {
            "attack" -> {
                Attack().attack(enemy, player)
                print("press any key to continue: ")
                readln()

            }

            "defense" -> {
                Defense().defense(enemy, player)
                print("press any key to continue: ")
                readln()

            }

            "cek status lawan" -> {
                enemy.display()
                print("\npress any key to continue: ")
                readln()
            }

            "menyerah" -> return false
        }
        return true

    }
}






