class Dollar(amount: Int) : Money(amount) {

    companion object {
        private const val currency: String = "USD"
    }

    // 型は引数のあとに定義
    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }

    override fun currency(): String {
        return currency
    }
}
