class Franc(amount: Int) : Money(amount) {

    // 型は引数のあとに定義
    override fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

}