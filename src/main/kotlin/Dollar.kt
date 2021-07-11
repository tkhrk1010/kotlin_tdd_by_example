class Dollar(private var amount: Int) {

    // 型は引数のあとに定義
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(any: Any?): Boolean {
        val dollar: Dollar = any as Dollar
        return amount == dollar.amount
    }

}
