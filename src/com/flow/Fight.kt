package com.flow

import com.character.Enemy
import com.character.Player
import kotlin.random.Random

class Fight(){
    val listBehave = listOf("attack", "caught off guard")

    fun fight(player: Player, enemy: Enemy){
        while (true){
            val behaveP = Random.nextInt(0, listBehave.size)
            val playerBehave = listBehave[behaveP]
            val behaveE = Random.nextInt(0, listBehave.size)
            val enemyBehave = listBehave[behaveE]
            when(playerBehave){
                "attack" -> {
                    println("${player.name} Attacking ${enemy.name}!")
                    print("next..")
                    readln()
                    println("\n")
                }
                "caught off guard" -> {
                    println("${player.name} Caught off guard by ${enemy.name}!")
                    print("next..")
                    readln()
                    println("\n")
                }
            }

            if (playerBehave == enemyBehave) {
                tied(player, enemy, playerBehave)
                break
            }
            else if (playerBehave.equals("attack", true) && enemyBehave.equals("caught off guard", true)) {
                attack(player, enemy)
                break
            }
            else if (playerBehave.equals("caught off guard", true) && enemyBehave.equals("attack", true)) {
                caughtOff(player, enemy)
                break
            }
        }
    }
    fun tied(player: Player, enemy: Enemy, playerBehaviour: String){
        println("${player.name} and ${enemy.name} both $playerBehaviour!")
        print("next..")
        readln()
        println("\n")

        when(playerBehaviour){
            "attack" -> {
                println("${player.name} Damage:\t ${player.damage}\n${enemy.name} Damage:\t ${enemy.damage}")
                print("next..")
                readln()
                println("\n")

                if ((player.damage ?: 0) > (enemy.damage ?: 0)){

                    println("${player.name} land more Attacks! ")
                    print("next..")
                    readln()
                    println("\n")

                    val damageTook = (player.damage ?: 0) - (enemy.damage ?: 0)

                    println("${enemy.name} took $damageTook Damage.")
                    print("next..")
                    readln()
                    println("\n")

                    enemy.health = maxOf(0, (enemy.health ?: 0)) - damageTook
                    println("${enemy.name} Health:\t ${enemy.health}")
                    print("next..")
                    readln()
                    println("\n")


                } else if((player.damage?: 0) < (enemy.damage?:0)){

                    println("${enemy.name} land more Attacks! ")
                    print("next..")
                    readln()
                    println("\n")

                    val damageTook = (enemy.damage ?: 0) - (player.damage ?: 0)

                    println("${player.name} took $damageTook Damage.")
                    print("next..")
                    readln()
                    println("\n")

                    player.health = maxOf(0, (player.health ?: 0)) - damageTook
                    println("${player.name} Health:\t ${player.health}")
                    print("next..")
                    readln()
                    println("\n")

                } else {
                    println("Both land the Same Damage!")
                    print("next..")
                    readln()
                    println("\n")

                    println("No Damage Lands!")

                    print("next..")
                    readln()
                    println("\n")

                }
            }
            "caught off guard" -> {
                println("No Attack Lands!")
                print("next..")
                readln()
                println("\n")

            }
        }


    }
    fun attack(player: Player, enemy: Enemy){
        enemy.health = maxOf(0, (enemy.health ?: 0)) - (player.damage?:0)
        println("${player.name} land ${player.damage} Damage!")
        print("next..")
        readln()
        println("\n")

        println("${enemy.name} Health:\t ${enemy.health}")
        print("next..")
        readln()
        println("\n")
    }
    fun caughtOff(player: Player, enemy: Enemy){
        player.health = maxOf(0, (player.health ?: 0)) - (enemy.damage?:0)
        println("${enemy.name} land ${enemy.damage} Damage!")
        print("next..")
        readln()
        println("\n")

        println("${player.name} Health:\t ${player.health}")
        print("next..")
        readln()
        println("\n")

    }

}