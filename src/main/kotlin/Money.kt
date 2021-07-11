// openを使ってoverride可能にしておく
open class Money(val amount: Int) {
    override fun equals(any: Any?): Boolean {
        val money: Money = any as Money
        return amount == money.amount
    }

}
