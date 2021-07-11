// openを使ってoverride可能にしておく
abstract class Money(val amount: Int) {
    abstract fun times(multiplier: Int): Money
    override fun equals(any: Any?): Boolean {
        val money: Money = any as Money
        return amount == money.amount && javaClass.equals(money.javaClass)
    }
    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }
    }
}
