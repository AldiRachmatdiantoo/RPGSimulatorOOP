class MakeChar() {
    lateinit var username: String
    lateinit var type: String
    lateinit var weapon: String
    lateinit var listWeapon: MutableList<String>


    fun start(){
        println("=====BUAT CHARACTER=====")
        username = checkNullOrBlank("Username: ")
        println("Berhasil membuat username!")
        makeTypeChar()

    }
    fun makeTypeChar() {
        val typeChar = mutableListOf("strength", "magic")
            type = checkFilterList("Pilih Type: ", typeChar)
            when(type){
                "strength" -> {
                    listWeapon = mutableListOf("swords", "bow", "shield")
                }
                "magic" -> {
                    listWeapon = mutableListOf("wand", "magic ring", "gauntlet")
                }
            }
            println("Berhasil Memilih Type!")
            makeWeaponChar()
    }
    fun makeWeaponChar() {

        weapon = checkFilterList("Pilih Weapon: ", listWeapon)
        println("Berhasil memilih Weapon!")
        makeSure()
    }
    fun makeSure(){
        val check = checkYesOrNo("Buat Akun? ")
        if (!check) {
            println("\nBuat Ulang..\n")
            start()
        } else {
            val player = CharacterRefactor().createChar(username, type, weapon)
            //bot
            val enemy = MakeEnemyChar().makeEnemyChar()
            GameFlow(player, enemy)

        }
    }



}