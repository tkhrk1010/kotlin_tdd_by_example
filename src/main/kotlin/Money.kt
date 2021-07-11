// openを使ってoverride可能にしておく
open class Money(var amount: Int, open var currency: String?) : Expression {

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }
    fun currency(): String? {
        return currency
    }

    override fun equals(obj: Any?): Boolean {
        val money: Money = obj as Money
        return amount == money.amount && currency == money.currency
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount,"USD")
        }
        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }

    //debug用
    override fun toString(): String {
        return "$amount $currency"
    }

    fun plus(addend: Money): Expression {
        return Money(amount + addend.amount, currency)
    }
}
