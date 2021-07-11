class Franc(amount: Int) : Money(amount) {
    companion object {
        private const val currency: String = "CHF"
    }

    // 型は引数のあとに定義
    override fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun currency(): String {
        return currency
    }
}