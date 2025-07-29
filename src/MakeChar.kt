class MakeChar() {
    var username: String? = null
    var type: String? = null
    var weapon: String? = null
    var health: Int? = 100
    var level: Int? = 1
    var damage: Int? = 10

    fun start(){
        println("=====BUAT CHARACTER=====")
        username = checkNullOrBlank("Username: ")
        println("Berhasil membuat username!")
        makeTypeChar()
    }
    fun makeTypeChar() {
        val typeChar = mutableListOf("strength", "magic")
            type = checkFilterList("Pilih Type: ", typeChar)
            println("Berhasil Memilih Type!")
            makeWeaponChar(type)
    }
    fun makeWeaponChar(type: String?) {
        when(type){
            "strength" -> {
                val strengthWeapon = mutableListOf("swords", "bow", "shield")
                weapon = checkFilterList("Pilih Weapon: ", strengthWeapon)
                when(weapon) {
                    "swords" -> {damage = (damage ?: 0) + 50 }
                    "bow" -> {damage = (damage ?: 0) + 40}
                    "shield" -> {health = (health ?: 0) + 60}
                }
            }
            "magic" -> {
                val magicWeapon = mutableListOf("wand", "magic ring", "gauntlet")
                weapon = checkFilterList("Pilih Weapon: ", magicWeapon)
                when(weapon) {
                    "wand" -> {damage = (damage?:0) + 60}
                    "magic ring" -> {damage = (damage?:0) + 40}
                    "gauntlet" -> {health = (health?:0) + 60}
                }

            }
        }
        println("Berhasil memilih Weapon!")
        val makeSure = checkYesOrNo("Buat Character? ")
        if (!makeSure){
            println("Buat ulang..")
            start()
        } else {
            val player  = Player(username, health, level, damage, weapon, type)
            player.display()
        }
    }




}