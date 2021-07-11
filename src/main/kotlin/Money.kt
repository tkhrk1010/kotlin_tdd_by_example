// openを使ってoverride可能にしておく
open class Money(var amount: Int, open var currency: String?) {

    open fun times(multiplier: Int): Money {
        return Money(1,"AAA")
    }
    fun currency(): String? {
        return currency
    }

    override fun equals(obj: Any?): Boolean {
        val money: Money = obj as Money
        return amount == money.amount && javaClass.equals(money.javaClass)
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount,"USD")
        }
        fun franc(amount: Int): Money {
            return Franc(amount, "CHF")
        }
    }

    //debug用
    override fun toString(): String {
        return "$amount $currency"
    }
}
