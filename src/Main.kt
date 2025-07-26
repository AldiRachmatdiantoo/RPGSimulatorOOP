fun main() {
    while (true) {
        val yesNoStart = checkYesOrNo("Ingin bermain Game Simulasi RPG? ")
        if (!yesNoStart) {
            println("Thanks!!")
            return
        } else {
            val player = Player(null, null, null, null, null)
            player.filteringChar()

        }
    }


}
fun checkYesOrNo(text: String): Boolean{
    print(text)
    var choice = readln()
    while (!choice.equals("y", true) && !choice.equals("n", true)){
        println("\nERROR! Tolong input dengan benar!\n!")
        print(text)
        choice = readln()
    }
    return choice.equals("y", true)
}
fun checkNullOrBlank(text: String): String{
    print(text)
    var input = readln()
    while (input.isBlank()){
        println("\nERROR! Tolong input dengan benar!\n")
        print(text)
        input = readln()
    }
    return input
}
fun checkFilterList(list: MutableList<String>, text: String): String{
    while (true){
    for ((index, value) in list.withIndex()){
        println("${index+1}.$value")
    }
    print(text)
    val input = readln().lowercase()
        if (list.any {it == input}){
            return input
        } else {
            println("Maaf, Type tidak ada!")
            continue
        }
    }



}
