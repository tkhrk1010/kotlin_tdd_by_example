class Franc(private var amount: Int) {

    // 型は引数のあとに定義
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun equals(any: Any?): Boolean {
        val franc: Franc = any as Franc
        return amount == franc.amount
    }

}