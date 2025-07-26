class Player(
    override var name: String?,
    override var health: Int?,
    override var baseDamage: Int?,
    override var baseHealth: Int?,
    override var type: String?
) : Character(){

    override var weapon: String? = "None"

    override fun displayChar() {
        TODO("Not yet implemented")
    }

    override fun filteringChar() {
        val chooseName = makeChar()
        val chooseType = makeType()

    }



}
