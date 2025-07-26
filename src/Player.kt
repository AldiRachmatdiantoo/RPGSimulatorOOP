class Player(
    override var name: String?,
    override var health: Int?,
    override var baseDamage: Int?,
    override var baseHealth: Int?,
    override var type: String?
) : Character(){

    override fun displayChar() {
        TODO("Not yet implemented")
    }

    override fun filteringChar() {
        name = makeChar()
        type = makeType()


    }



}
