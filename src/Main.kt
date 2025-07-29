fun main() {
    val toProgram = checkYesOrNo("Ingin bermain Simulasi Game RPG?")
    if (!toProgram) {
        println("Terima Kasih!")
        return
    } else {
        MakeChar().start()

    }
}
fun checkYesOrNo(text: String) : Boolean{
    print(text)
    var choice = readln()
    while (!choice.equals("y", true) && !choice.equals("n", true)){
        println("Error! Tolong input dengan benar!")
        print(text)
        choice = readln()
    }
    return choice.equals("y", true)
}
fun checkNullOrBlank(text: String): String {
    print(text)
    var input = readln()
    while (input.isBlank()){
        println("Tidak boleh kosong!")
        print(text)
        input = readln()
    }
    return input
}
fun checkFilterList(text: String, list: MutableList<String>): String{
    while (true) {
        println("\n===============")
        for ((index, value) in list.withIndex()) {
            println("${index + 1}.$value")
        }
        print(text)
        val choose = readln()
        if (list.any { it == choose }) {
            return choose
        } else {
            println("Belum Tersedia!")
            continue
        }
    }
}