package com.flow

import com.character.Enemy
import com.character.Player

class GameFlow(val player: Player, val enemy: Enemy) {
    init {
        println("SELAMAT DATANG DI PERMAINAN")
        gameFlow1()
    }
    fun gameFlow1(){
        while (true) {
            println("\n\n===============")
            println("${player.name?.uppercase()} VS ${enemy.name?.uppercase()}")
            println("===============\n")
            player.display()
            val toMenu = Menu().checkMenuList(enemy, player)
            if(!toMenu){
                break
            }
        }
    }


}
//1.Cek Status com.character.Enemy
//2.Attack com.character.Enemy
//3.Defense
//4.Gave up