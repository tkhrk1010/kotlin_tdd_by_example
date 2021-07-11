class Dollar(amount: Int) : Money(amount) {

    // 型は引数のあとに定義
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(any: Any?): Boolean {
        val money: Money = any as Money
        return amount == money.amount
    }

}
