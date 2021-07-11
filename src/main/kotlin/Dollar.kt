class Dollar(amount: Int, currency: String?) : Money(amount, currency) {

    // 型は引数のあとに定義
    override fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

}