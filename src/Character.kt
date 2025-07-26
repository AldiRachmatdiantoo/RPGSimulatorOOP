abstract class Character {
    abstract var name: String?
    abstract var health: Int?
    abstract var baseDamage: Int?
    abstract var baseHealth: Int?
    abstract var type: String?
    abstract fun displayChar()
    abstract fun filteringChar()

    fun makeChar(): String? {
        name = checkNullOrBlank("Masukkan name: ")
        println("Berhasil Memasukkan nama $name!")
        return name
    }
    fun makeType(): String? {
        val listType = mutableListOf("strength", "magic")

        type = checkFilterList(listType,"Pilih type yang anda inginkan: ")
        println("Anda memilih $type type!")
        return type
    }
}
