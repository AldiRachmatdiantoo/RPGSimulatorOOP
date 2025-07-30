package com.flow
import com.character.Enemy
import checkFilterList
import com.character.Player

class Menu() {

    fun checkMenuList(enemy: Enemy, player: Player): Boolean {
        val listMenu = mutableListOf("go", "cek status lawan", "menyerah")
        val choose = checkFilterList("Pilih: ", listMenu)
        when (choose) {
            "go" -> {
                Fight().fight(player, enemy)
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






