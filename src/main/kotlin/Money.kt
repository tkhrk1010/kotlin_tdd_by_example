// openを使ってoverride可能にしておく
abstract class Money(val amount: Int) {
    abstract fun times(multiplier: Int): Money
    abstract fun currency(): String

    override fun equals(any: Any?): Boolean {
        val money: Money = any as Money
        return amount == money.amount && javaClass.equals(money.javaClass)
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount)
        }
        fun franc(amount: Int): Money {
            return Franc(amount)
        }
    }
}
