fun main() {
    val choice = checkYesOrNo("Ingin bermain simulasi game RPG? (y/n) ")
    if (!choice){
        println("\nTERIMA KASIH!")
        return
    } else {
        //make acc
        val player1 = Player()
        val enemy = Enemy()
        player1.makeChar()
        enemy.makeChar()
        while (true) {
            val startCheck = checkYesOrNo("Mulai? ")
            if (!startCheck){
                println("TERIMA KASIH!")
                return
            } else {
                val gameFlow = GameFlow(player1, enemy)
                gameFlow.start()
                return

            }
        }

    }
}
fun checkYesOrNo(text: String): Boolean {
    print(text)
    var choice = readln()
    while (!choice.equals("y", true) && !choice.equals("n", true)) {
        println("ERROR! TOLONG ISI DENGAN BENAR!")
        print(text)
        choice = readln()
    }
    return choice.equals("y", true)
}
fun checkNullOrBlank(text: String): String{
    print(text)
    var input = readln()
    while (input.isBlank()){
        println("ERROR! TOLONG ISI  DENGAN BENAR!")
        input = readln()
    }
    return input.uppercase()
}
