class GameFlow(val player: Player, val enemy: Enemy) {
    init {
        println("SELAMAT DATANG DI PERMAINAN")
        gameFlow1()
    }
    fun gameFlow1(){
        while (true) {
            println("===============")
            println("${player.name?.uppercase()} VS ${enemy.name?.uppercase()}")
            println("===============")
            break

        }
    }
}

//1.Cek Status Enemy
//2.Attack Enemy
//3.Defense
//4.Gave up
