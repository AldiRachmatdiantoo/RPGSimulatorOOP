import kotlin.random.Random

class GameFlow(var player: Player, var enemy: Enemy) {
    fun start(){
        println("\n\n===${player.name} VS ${enemy.name}===\n\n")

        //player unique weapon
        println("=====PILIH ITEMS=====")
        val unique = mutableListOf("swords", "iron armor", "wand")
        val playerUniqueItems = uniqueItemsPlayer(unique)

        //enemy unique weapon
        val randomForEnemyWeapon = Random.nextInt(0, unique.size)
        val getWeaponEnemy = unique[randomForEnemyWeapon]
        println("\nKEREN! ANDA MEMILIH $playerUniqueItems!\n")
        print("PRESS ANY KEY TO PLAY")
        readln()

        play()

    }
    fun uniqueItemsPlayer(unique: MutableList<String>): String{

        while (true) {
            for ((index, value) in unique.withIndex()) {
                println("${index + 1}.$value")
            }
            val chooseUniqueItems = checkNullOrBlank("Pilih 1 item: ")
            if (!unique.any{it == chooseUniqueItems.lowercase()}){
                println("ITEM TIDAK ADA!")
                continue
            } else {
                return chooseUniqueItems
            }
        }
    }
    fun play(){
        println("GACOR")
    }
}